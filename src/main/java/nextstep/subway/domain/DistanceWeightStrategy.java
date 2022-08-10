package nextstep.subway.domain;

import org.springframework.stereotype.Component;

@Component
public class DistanceWeightStrategy implements EdgeWeightStrategy {

    @Override
    public int getEdgeWeight(Section section) {
        return section.getDistance();
    }

}
