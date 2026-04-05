package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import al.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import md.d0;
import md.h0;
import yd.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27008a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        h0.initialize(context);
        d0.a priority = d0.builder().setBackendName(queryParameter).setPriority(a.valueOf(iIntValue));
        if (queryParameter2 != null) {
            priority.setExtras(Base64.decode(queryParameter2, 0));
        }
        h0.getInstance().getUploader().upload(priority.build(), i10, new b(12));
    }
}
