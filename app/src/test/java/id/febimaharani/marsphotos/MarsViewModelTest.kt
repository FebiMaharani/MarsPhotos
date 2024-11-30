package id.febimaharani.marsphotos

import id.febimaharani.marsphotos.fake.FakeDataSource
import id.febimaharani.marsphotos.fake.FakeNetworkMarsPhotosRepository
import id.febimaharani.marsphotos.rules.TestDispatcherRule
import id.febimaharani.marsphotos.ui.screens.MarsUiState
import id.febimaharani.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(FakeDataSource.photosList),
                marsViewModel.marsUiState
            )
        }
}
