package com.google.android.exoplayer2.ui;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import nh.v7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class v0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparator f28397c;

    public /* synthetic */ v0(Comparator comparator, int i10) {
        this.f28396b = i10;
        this.f28397c = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f28396b;
        Comparator comparator = this.f28397c;
        switch (i10) {
            case 0:
                int i11 = TrackSelectionView.f28146p;
                break;
            case 1:
                int i12 = io.bidmachine.media3.ui.TrackSelectionView.f61644p;
                break;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                break;
            case 3:
                v7 v7Var = (v7) obj;
                v7 v7Var2 = (v7) obj2;
                break;
            case 4:
                if (obj != obj2) {
                    if (obj != null) {
                        if (obj2 != null) {
                            break;
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                if (obj != obj2) {
                    if (obj != null) {
                        if (obj2 != null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return comparator.compare(obj, obj2);
    }
}
