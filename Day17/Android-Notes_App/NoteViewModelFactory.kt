//Agar tumhare ViewModel ko Application / Repository / Dependency chahiye ho → tumhe ViewModelFactory banana padta hai.
//NoteViewModelFactory ka kaam hai wo dependencies inject karke tumhara ViewModel banana.
class NoteViewModelFactory(val app : Application ,private val noteRepository: NoteRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return NoteViewModel(app,noteRepository) as T
    }
}
