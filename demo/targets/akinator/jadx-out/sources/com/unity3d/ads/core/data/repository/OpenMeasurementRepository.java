package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, d<? super OMResult> dVar);

    Object finishSession(ByteString byteString, d<? super OMResult> dVar);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z10, d<? super OMResult> dVar);

    boolean isOMActive();

    void setOMActive(boolean z10);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, d<? super OMResult> dVar);
}
