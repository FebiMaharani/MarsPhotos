package id.febimaharani.marsphotos.fake

import id.febimaharani.marsphotos.model.MarsPhoto
import id.febimaharani.marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
