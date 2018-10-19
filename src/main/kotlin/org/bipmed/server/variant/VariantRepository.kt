package org.bipmed.server.variant

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface VariantRepository : MongoRepository<Variant, String>