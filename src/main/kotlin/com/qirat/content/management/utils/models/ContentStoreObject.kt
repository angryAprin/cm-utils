package com.qirat.content.management.utils.models

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.time.OffsetDateTime
import java.util.*

/**
 *
 * @author Tauriq Behardien
 */
@Component
class ContentStoreObject {
    @Autowired
    private lateinit var objectMapper: ObjectMapper

    var creationDate = OffsetDateTime.now()
    var id = UUID.randomUUID().toString()

    var data: String
    var type: String

    lateinit var clientData: ClientData

    constructor(data: String, type: String) {
        this.data = data
        this.type = type
    }

    constructor(data: String, type: String, clientData: ClientData) {
        this.data = data
        this.type = type
        this.clientData = clientData
    }

    override fun toString(): String {
        return this.objectMapper.writeValueAsString(this)
    }
}

