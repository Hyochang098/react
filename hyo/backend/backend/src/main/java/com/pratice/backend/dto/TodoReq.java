package com.pratice.backend.dto;

/**
 *  기존에 말했던 클라이언트(프론트엔드 단)에서 오는 정보를 송수신하기 위한 용도입니다.
 *  도메인(=엔티티)은 영속성 계층으로 변화하지 않아야합니다.
 *  도메인은 DB와 접근을 위한 용도로만 사용하며 DTO는 클라이언트와 대화를 하기 때문에 필요한 정보를 고려하여 적절하게 구현할 수 있음
 *  TodoReq는 예시로 Todo관련 요청 시 필요한 데이터를 명시해 놓은 부분입니다.
 *  -> 해당 DTO는 없어질 수 있습니다. 예시임
 */
public class TodoReq {

}
