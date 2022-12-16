package android.realproject.warrantyexpiryalertsapp.data.navigation

import android.realproject.warrantyexpiryalertsapp.data.db.product.ProductsUnderWarrantyEntity
import android.realproject.warrantyexpiryalertsapp.data.db.user_info.UserEntity


/**
 * MainScreen - фрагмент главного экрана
 * HelpFulInfoScreen - фрагмент, в котором будет обьясненно полезность использования этого приложения
 * AllCategoryScreen - просто фрагмент, в котором будет выведены все категории для продуктов
 * CreateProductScreen - фрагмент, где будет создан новый продукт для юзера
 * SettingsScreen - фрагмент настроек
 *
 * ProfileUser - профиль юзера
 * ProductItemScreen - ну это уже фрагмент, где будет выведена вся инфа по товару....
 * CategoryProductScreen - фрагмент, который будет выводить список товаров конкретной категории
 */

sealed class Screen(val route: String){
    object MainScreen: Screen(route = "main_screen")
    object AllCategoryScreen: Screen(route = "all_category_screen")
    object CreateProductScreen: Screen(route = "create_product_screen")
    object SettingsScreen: Screen(route = "setting_screen")
    object AdditionallyScreen: Screen(route = "additionally_screen")

    object CategoryProductScreen: Screen(route = "category_screen_item")
    object ProfileUser: Screen(route = "user_info_screen")
    object ProductItemScreen: Screen(route = "product_item_screen")
}