package com.user.userservice.service;


import java.util.List;


public interface UtilisateurService <ResponseDTO, RequestDTO ,ID> {
    ResponseDTO addUser(RequestDTO requestDTO);
    ResponseDTO updateUser(RequestDTO requestDTO);
    List<ResponseDTO> findAllUser();
    ResponseDTO findOneUser(ID id);
    void deleteUser(ID id);
}
