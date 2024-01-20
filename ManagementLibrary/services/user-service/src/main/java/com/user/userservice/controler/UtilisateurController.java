package com.user.userservice.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UtilisateurController <ResponseDTO, RequestDTO ,ID> {

    public ResponseDTO getOneById(@PathVariable ID id ) ;

    public List<ResponseDTO> getAll() ;

    public ResponseDTO save (@RequestBody RequestDTO requestDTO) ;

    public void delete (@PathVariable ID id) ;
}
