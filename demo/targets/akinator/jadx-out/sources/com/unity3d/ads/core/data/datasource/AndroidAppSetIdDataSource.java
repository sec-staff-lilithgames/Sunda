package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidAppSetIdDataSource {
    private final MutableStateFlow<String> _appSetIdFlow;
    private final Context applicationContext;
    private final MutableStateFlow<Boolean> isCollecting;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AppSetIdInfo) obj);
            return x0.f87415a;
        }

        public final void invoke(AppSetIdInfo appSetIdInfo) {
            String id2 = appSetIdInfo.getId();
            e0.checkNotNullExpressionValue(id2, "it.id");
            AndroidAppSetIdDataSource.this._appSetIdFlow.setValue(id2);
        }
    }

    public AndroidAppSetIdDataSource(Context applicationContext) {
        e0.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._appSetIdFlow = StateFlowKt.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final String getAppSetId() {
        return this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        MutableStateFlow<Boolean> mutableStateFlow = this.isCollecting;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.getClass();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            AppSet.getClient(this.applicationContext).getAppSetIdInfo().addOnSuccessListener(new b1.l(1, new AnonymousClass2()));
        } catch (Throwable unused) {
        }
    }
}
