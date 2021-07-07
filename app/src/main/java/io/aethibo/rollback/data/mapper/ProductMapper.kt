package io.aethibo.rollback.data.mapper

import io.aethibo.rollback.data.utils.EntityMapper
import io.aethibo.rollback.domain.mapped.ProductItem
import io.aethibo.rollback.domain.response.ProductItemResponse

object ProductMapper : EntityMapper<ProductItemResponse, ProductItem> {

    override fun mapFromEntity(entity: ProductItemResponse): ProductItem =
        ProductItem(
            id = entity.id,
            title = entity.title,
            description = entity.description,
            image = entity.image,
            category = entity.category,
            price = entity.price
        )

    override fun mapToEntity(domainModel: ProductItem): ProductItemResponse =
        ProductItemResponse(
            id = domainModel.id,
            title = domainModel.title,
            description = domainModel.description,
            image = domainModel.image,
            category = domainModel.category,
            price = domainModel.price
        )

    fun mapFromEntityList(entities: List<ProductItemResponse>): List<ProductItem> =
        entities.map { mapFromEntity(it) }
}