/*
 * Copyright © 2013-2017, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ddd.domain.model.cargo;

import org.apache.commons.lang.Validate;
import org.mongodb.morphia.annotations.Embedded;
import org.seedstack.business.domain.BaseValueObject;

/**
 * Uniquely identifies a particular cargo. Automatically generated by the application.
 */
@Embedded
public final class TrackingId extends BaseValueObject {
    private String id;

    private TrackingId() {
        // required by persistence
    }

    /**
     * Constructor.
     *
     * @param id Id string.
     */
    public TrackingId(final String id) {
        Validate.notNull(id);
        this.id = id;
    }

    /**
     * @return String representation of this tracking id.
     */
    public String id() {
        return id;
    }
}