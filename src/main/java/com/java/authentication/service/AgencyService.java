package com.java.authentication.service;

import java.util.Optional;

import com.java.authentication.entity.Agency;
import com.java.authentication.entity.Client;

import net.minidev.json.JSONObject;

public interface AgencyService {

	JSONObject saveAgent(Agency agency);

}
