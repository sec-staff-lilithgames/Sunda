package com.unity3d.services.core.fid;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import tu.v;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FIdStaticBridge extends GenericBridge {
    public FIdStaticBridge() {
        super(o1.mapOf(new v(Constants.GET_INSTANCE, new Class[]{Context.class})), false);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }

    public final FIdBridge getInstance(Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(context, "context");
        Object objCallNonVoidMethod = callNonVoidMethod(Constants.GET_INSTANCE, null, context);
        if (objCallNonVoidMethod != null) {
            return new FIdBridge(objCallNonVoidMethod);
        }
        return null;
    }
}
