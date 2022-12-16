package android.realproject.warrantyexpiryalertsapp.data.db.product



interface ProductsUnderWarrantyImpl {

    fun getAllProduct(): MutableList<ProductsUnderWarrantyEntity>
    suspend fun insertProduct(product: ProductsUnderWarrantyEntity)
    suspend fun deleteProduct(product: ProductsUnderWarrantyEntity)
    suspend fun getProductByCategory(category: String): MutableList<ProductsUnderWarrantyEntity>

}