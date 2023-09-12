// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.secrets.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/** A secret consisting of a value, id and its attributes. */
@Fluent
public class SecretBundle implements JsonSerializable<SecretBundle> {
    /*
     * The secret value.
     */
    private String value;

    /*
     * The secret id.
     */
    private String id;

    /*
     * The content type of the secret.
     */
    private String contentType;

    /*
     * The secret management attributes.
     */
    private SecretAttributes attributes;

    /*
     * Application specific metadata in the form of key-value pairs.
     */
    private Map<String, String> tags;

    /*
     * If this is a secret backing a KV certificate, then this field specifies the corresponding key backing the KV
     * certificate.
     */
    private String kid;

    /*
     * True if the secret's lifetime is managed by key vault. If this is a secret backing a certificate, then managed
     * will be true.
     */
    private Boolean managed;

    /** Creates an instance of SecretBundle class. */
    public SecretBundle() {}

    /**
     * Get the value property: The secret value.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The secret value.
     *
     * @param value the value value to set.
     * @return the SecretBundle object itself.
     */
    public SecretBundle setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the id property: The secret id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The secret id.
     *
     * @param id the id value to set.
     * @return the SecretBundle object itself.
     */
    public SecretBundle setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the contentType property: The content type of the secret.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type of the secret.
     *
     * @param contentType the contentType value to set.
     * @return the SecretBundle object itself.
     */
    public SecretBundle setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the attributes property: The secret management attributes.
     *
     * @return the attributes value.
     */
    public SecretAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The secret management attributes.
     *
     * @param attributes the attributes value to set.
     * @return the SecretBundle object itself.
     */
    public SecretBundle setAttributes(SecretAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the tags property: Application specific metadata in the form of key-value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application specific metadata in the form of key-value pairs.
     *
     * @param tags the tags value to set.
     * @return the SecretBundle object itself.
     */
    public SecretBundle setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the kid property: If this is a secret backing a KV certificate, then this field specifies the corresponding
     * key backing the KV certificate.
     *
     * @return the kid value.
     */
    public String getKid() {
        return this.kid;
    }

    /**
     * Set the kid property: If this is a secret backing a KV certificate, then this field specifies the corresponding
     * key backing the KV certificate.
     *
     * @param kid the kid value to set.
     * @return the SecretBundle object itself.
     */
    SecretBundle setKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the managed property: True if the secret's lifetime is managed by key vault. If this is a secret backing a
     * certificate, then managed will be true.
     *
     * @return the managed value.
     */
    public Boolean isManaged() {
        return this.managed;
    }

    /**
     * Set the managed property: True if the secret's lifetime is managed by key vault. If this is a secret backing a
     * certificate, then managed will be true.
     *
     * @param managed the managed value to set.
     * @return the SecretBundle object itself.
     */
    SecretBundle setManaged(Boolean managed) {
        this.managed = managed;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("contentType", this.contentType);
        jsonWriter.writeJsonField("attributes", this.attributes);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretBundle from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretBundle if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecretBundle.
     */
    public static SecretBundle fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    SecretBundle deserializedSecretBundle = new SecretBundle();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            deserializedSecretBundle.value = reader.getString();
                        } else if ("id".equals(fieldName)) {
                            deserializedSecretBundle.id = reader.getString();
                        } else if ("contentType".equals(fieldName)) {
                            deserializedSecretBundle.contentType = reader.getString();
                        } else if ("attributes".equals(fieldName)) {
                            deserializedSecretBundle.attributes = SecretAttributes.fromJson(reader);
                        } else if ("tags".equals(fieldName)) {
                            Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                            deserializedSecretBundle.tags = tags;
                        } else if ("kid".equals(fieldName)) {
                            deserializedSecretBundle.kid = reader.getString();
                        } else if ("managed".equals(fieldName)) {
                            deserializedSecretBundle.managed = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedSecretBundle;
                });
    }
}