package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.to.AbstractAnnotatedBean;
import org.apache.syncope.model.JsonObject;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class EsempioLogic extends AbstractTransactionalLogic<AbstractAnnotatedBean> {

    public JsonObject jsonEsempio(){
        JsonObject json = new JsonObject();
        json.setNome("Mattia");
        json.setCognome("Di Federico");
        json.setEta(31);
        try {
            json.setDataNascita(new SimpleDateFormat("dd/MM/yyyy").parse("01/04/1988"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    protected AbstractAnnotatedBean resolveReference(final Method method, final Object... os)
            throws UnresolvedReferenceException {

        throw new UnresolvedReferenceException();
    }

}