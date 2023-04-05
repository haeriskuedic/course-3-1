package com.udacity.course3.repository;


import com.udacity.course3.data.CandyData;

import java.util.List;

public interface CandyDAO {
    List<CandyData> list();

    void addToDelivery(Long candyId, Long deliveryId);

    List<CandyData> findByDelivery(Long deliveryId);
}
