package cpp.baevee.photogalley

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import cpp.baevee.photogalley.api.FlickrFetchr
import cpp.baevee.photogalley.api.GalleryItem

class PhotoGalleryViewModel : ViewModel() {
    val galleryItemLiveData: LiveData<List<GalleryItem>>
    init {
        galleryItemLiveData = FlickrFetchr().fetchPhotos()
    }
}