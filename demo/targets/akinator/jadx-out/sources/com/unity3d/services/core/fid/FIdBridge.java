package com.unity3d.services.core.fid;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.e0;
import tu.v;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FIdBridge extends GenericBridge {
    private final Object instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FIdBridge(Object instance) {
        super(o1.mapOf(new v(Constants.GET_APP_INSTANCE_ID, new Class[0])), false);
        e0.checkNotNullParameter(instance, "instance");
        this.instance = instance;
    }

    public final Task<String> getAppInstanceId() {
        Task<String> task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        if (task != null) {
            return task;
        }
        Task<String> taskForResult = Tasks.forResult(null);
        e0.checkNotNullExpressionValue(taskForResult, "forResult(null)");
        return taskForResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
