// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContentKeyPolicyPlayReadyUnknownOutputPassingOption. */
public final class ContentKeyPolicyPlayReadyUnknownOutputPassingOption
    extends ExpandableStringEnum<ContentKeyPolicyPlayReadyUnknownOutputPassingOption> {
    /** Static value Unknown for ContentKeyPolicyPlayReadyUnknownOutputPassingOption. */
    public static final ContentKeyPolicyPlayReadyUnknownOutputPassingOption UNKNOWN = fromString("Unknown");

    /** Static value NotAllowed for ContentKeyPolicyPlayReadyUnknownOutputPassingOption. */
    public static final ContentKeyPolicyPlayReadyUnknownOutputPassingOption NOT_ALLOWED = fromString("NotAllowed");

    /** Static value Allowed for ContentKeyPolicyPlayReadyUnknownOutputPassingOption. */
    public static final ContentKeyPolicyPlayReadyUnknownOutputPassingOption ALLOWED = fromString("Allowed");

    /** Static value AllowedWithVideoConstriction for ContentKeyPolicyPlayReadyUnknownOutputPassingOption. */
    public static final ContentKeyPolicyPlayReadyUnknownOutputPassingOption ALLOWED_WITH_VIDEO_CONSTRICTION =
        fromString("AllowedWithVideoConstriction");

    /**
     * Creates or finds a ContentKeyPolicyPlayReadyUnknownOutputPassingOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentKeyPolicyPlayReadyUnknownOutputPassingOption.
     */
    @JsonCreator
    public static ContentKeyPolicyPlayReadyUnknownOutputPassingOption fromString(String name) {
        return fromString(name, ContentKeyPolicyPlayReadyUnknownOutputPassingOption.class);
    }

    /**
     * Gets known ContentKeyPolicyPlayReadyUnknownOutputPassingOption values.
     *
     * @return known ContentKeyPolicyPlayReadyUnknownOutputPassingOption values.
     */
    public static Collection<ContentKeyPolicyPlayReadyUnknownOutputPassingOption> values() {
        return values(ContentKeyPolicyPlayReadyUnknownOutputPassingOption.class);
    }
}
