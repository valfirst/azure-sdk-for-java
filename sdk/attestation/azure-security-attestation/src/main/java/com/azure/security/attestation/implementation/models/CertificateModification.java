// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CertificateModification. */
public final class CertificateModification extends ExpandableStringEnum<CertificateModification> {
    /** Static value IsPresent for CertificateModification. */
    public static final CertificateModification IS_PRESENT = fromString("IsPresent");

    /** Static value IsAbsent for CertificateModification. */
    public static final CertificateModification IS_ABSENT = fromString("IsAbsent");

    /**
     * Creates or finds a CertificateModification from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateModification.
     */
    @JsonCreator
    public static CertificateModification fromString(String name) {
        return fromString(name, CertificateModification.class);
    }

    /** @return known CertificateModification values. */
    public static Collection<CertificateModification> values() {
        return values(CertificateModification.class);
    }
}