package id.febimaharani.marsphotos.fake

import id.febimaharani.marsphotos.data.MarsPhotosRepository
import id.febimaharani.marsphotos.model.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository{
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
