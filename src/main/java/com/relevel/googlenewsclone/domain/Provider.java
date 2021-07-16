package com.relevel.googlenewsclone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Model class for news provider.
 *
 * @since Jul 16, 2021 10:26 AM
 */
@Entity
public class Provider {
    
    @Id
    private long providerId;

}
