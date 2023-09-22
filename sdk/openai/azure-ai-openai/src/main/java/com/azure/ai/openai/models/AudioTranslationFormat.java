// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines available options for the underlying response format of output translation information. */
public final class AudioTranslationFormat extends ExpandableStringEnum<AudioTranslationFormat> {

    /** Use a response body that is a JSON object containing a single 'text' field for the translation. */
    @Generated public static final AudioTranslationFormat JSON = fromString("json");

    /**
     * Use a response body that is a JSON object containing translation text along with timing, segments, and other
     * metadata.
     */
    @Generated public static final AudioTranslationFormat VERBOSE_JSON = fromString("verbose_json");

    /** Use a response body that is plain text containing the raw, unannotated translation. */
    @Generated public static final AudioTranslationFormat TEXT = fromString("text");

    /** Use a response body that is plain text in SubRip (SRT) format that also includes timing information. */
    @Generated public static final AudioTranslationFormat SRT = fromString("srt");

    /**
     * Use a response body that is plain text in Web Video Text Tracks (VTT) format that also includes timing
     * information.
     */
    @Generated public static final AudioTranslationFormat VTT = fromString("vtt");

    /**
     * Creates a new instance of AudioTranslationFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AudioTranslationFormat() {}

    /**
     * Creates or finds a AudioTranslationFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AudioTranslationFormat.
     */
    @Generated
    @JsonCreator
    public static AudioTranslationFormat fromString(String name) {
        return fromString(name, AudioTranslationFormat.class);
    }

    /**
     * Gets known AudioTranslationFormat values.
     *
     * @return known AudioTranslationFormat values.
     */
    @Generated
    public static Collection<AudioTranslationFormat> values() {
        return values(AudioTranslationFormat.class);
    }
}