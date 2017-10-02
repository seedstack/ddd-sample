package org.seedstack.samples.ddd.domain.model.aggregate;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.seedstack.business.domain.BaseAggregateRoot;

@Entity
public class Aggregate extends BaseAggregateRoot<String> {
    @Id
    private String id;

    private Aggregate() {
        // required by persistence implementation
    }

    public Aggregate(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
