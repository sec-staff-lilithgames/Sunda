package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.util.Pair;
import java.lang.Throwable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ErrorMessageProvider<T extends Throwable> {
    Pair<Integer, String> getErrorMessage(T t10);
}
