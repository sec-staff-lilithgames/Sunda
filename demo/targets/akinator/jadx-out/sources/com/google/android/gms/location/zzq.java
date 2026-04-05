package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzq implements Comparator<DetectedActivity> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
        DetectedActivity detectedActivity3 = detectedActivity;
        DetectedActivity detectedActivity4 = detectedActivity2;
        Preconditions.checkNotNull(detectedActivity3);
        Preconditions.checkNotNull(detectedActivity4);
        int iCompareTo = Integer.valueOf(detectedActivity4.getConfidence()).compareTo(Integer.valueOf(detectedActivity3.getConfidence()));
        return iCompareTo == 0 ? Integer.valueOf(detectedActivity3.getType()).compareTo(Integer.valueOf(detectedActivity4.getType())) : iCompareTo;
    }
}
