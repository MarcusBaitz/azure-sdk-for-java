// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.contentsafety;

import com.azure.ai.contentsafety.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class AnalyzeImageTests extends ContentSafetyClientTestBase {
    @Test
    public void testAnalyzeImageTests() throws IOException {
        // method invocation
        ImageData image = new ImageData();
        String cwd = System.getProperty("user.dir");
        String source = "/src/samples/resources/image.jpg";
        image.setContent(Files.readAllBytes(Paths.get(cwd, source)));

        AnalyzeImageResult response =
                contentSafetyClient.analyzeImage(
                        new AnalyzeImageOptions(image));

        // response assertion
        Assertions.assertNotNull(response);

        ImageAnalyzeSeverityResult responseHateResult = response.getHateResult();
        Assertions.assertNotNull(responseHateResult);

        ImageCategory responseHateResultCategory = responseHateResult.getCategory();
        Assertions.assertEquals(ImageCategory.HATE, responseHateResultCategory);
        int responseHateResultSeverity = responseHateResult.getSeverity();
        Assertions.assertEquals(0, responseHateResultSeverity);
        ImageAnalyzeSeverityResult responseSelfHarmResult = response.getSelfHarmResult();
        Assertions.assertNotNull(responseSelfHarmResult);

        ImageCategory responseSelfHarmResultCategory = responseSelfHarmResult.getCategory();
        Assertions.assertEquals(ImageCategory.SELF_HARM, responseSelfHarmResultCategory);
        int responseSelfHarmResultSeverity = responseSelfHarmResult.getSeverity();
        Assertions.assertEquals(0, responseSelfHarmResultSeverity);
        ImageAnalyzeSeverityResult responseSexualResult = response.getSexualResult();
        Assertions.assertNotNull(responseSexualResult);

        ImageCategory responseSexualResultCategory = responseSexualResult.getCategory();
        Assertions.assertEquals(ImageCategory.SEXUAL, responseSexualResultCategory);
        int responseSexualResultSeverity = responseSexualResult.getSeverity();
        Assertions.assertEquals(0, responseSexualResultSeverity);
        ImageAnalyzeSeverityResult responseViolenceResult = response.getViolenceResult();
        Assertions.assertNotNull(responseViolenceResult);

        ImageCategory responseViolenceResultCategory = responseViolenceResult.getCategory();
        Assertions.assertEquals(ImageCategory.VIOLENCE, responseViolenceResultCategory);
        int responseViolenceResultSeverity = responseViolenceResult.getSeverity();
        Assertions.assertEquals(2, responseViolenceResultSeverity);
    }
}