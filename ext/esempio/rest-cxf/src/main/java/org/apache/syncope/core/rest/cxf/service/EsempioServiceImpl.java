package org.apache.syncope.core.rest.cxf.service;

import org.apache.syncope.common.rest.api.service.EsempioService;
import org.apache.syncope.common.rest.api.service.JsonObject;
import org.apache.syncope.core.logic.EsempioLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EsempioServiceImpl extends AbstractServiceImpl implements EsempioService {
    @Autowired
    private EsempioLogic logic;

    @Override
    public JsonObject jsonEsempio() {
        return logic.jsonEsempio();
    }
}
