package com.pavan.chess.dto;

import com.pavan.chess.model.Cell;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class MoveRequest {

    private final long playerId ;
    private final Cell startCell ;
    private final Cell endCell ;

}
