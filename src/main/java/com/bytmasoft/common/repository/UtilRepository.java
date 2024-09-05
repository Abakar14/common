package com.bytmasoft.common.repository;

import com.bytmasoft.common.utils.DatabaseConstants;
import org.springframework.data.jpa.repository.Query;
import java.sql.Timestamp;

public interface UtilRepository {

    @Query(value = "select "+ DatabaseConstants.CURRENT_TIMESTAMP, nativeQuery = true)
    Timestamp getCurrentTimestamp();

}
