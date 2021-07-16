package com.relevel.googlenewsclone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Model class for News.
 *
 * @since Jul 16, 2021 10:25 AM
 */
@Entity
public class News {
    
    @Id
    private long newsId;

}
