class NoteAdapter : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    class NoteViewHolder(val itemBinding : NoteLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root)

//    Ye isliye use krte h kyuki agr hum recycler view mai refresh krte hai
//    items to har item dubara bind hoga , heavy lag aega even if sirf ek
//    item change ya edit kre to b isliye ye use krte hai Ye naya aur purana
//    list compare karke sirf badle hue items ko update karta hai.
        private val differCallback = object : DiffUtil.ItemCallback<Note>(){
        override fun areItemsTheSame(
            oldItem: Note,
            newItem: Note
        ): Boolean {
            return oldItem.id == newItem.id &&
                    oldItem.noteTitle == newItem.noteTitle &&
                    oldItem.noteDesc == newItem.noteDesc
        }

        override fun areContentsTheSame(
            oldItem: Note,
            newItem: Note
        ): Boolean {
            return oldItem==newItem
        }

    }
//  ye comparison background thread pe karta hai aur sirf changed items ko RecyclerView me update karta hai.
    val differ = AsyncListDiffer(this,differCallback)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NoteViewHolder {
        return NoteViewHolder(
                NoteLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                )
    }

    override fun onBindViewHolder(
        holder: NoteViewHolder,
        position: Int
    ) {
        val currentNote = differ.currentList[position]

        holder.itemBinding.apply {
            noteTitle.text = currentNote.noteTitle
            noteDesc.text = currentNote.noteDesc
        }

        holder.itemView.setOnClickListener {
            val direction = HomeFragmentDirections.actionHomeFragmentToEditNoteFragment(currentNote)
            it.findNavController().navigate(direction)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}
