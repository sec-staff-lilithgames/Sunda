package wm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import java.util.Collections;
import java.util.List;
import um.h0;
import ym.m;
import ym.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final int f90735b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90736c;

    public b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f90735b = displayMetrics.widthPixels * displayMetrics.heightPixels;
        this.f90736c = h0.isLandscapeOrientation(context);
    }

    @Override // wm.d
    public Pair<m, n> pickVideo(List<Pair<m, n>> list) {
        Pair<m, n> pair = null;
        if (list == null) {
            return null;
        }
        Collections.sort(list, new a(this));
        io.bidmachine.iab.vast.e.d("DefaultMediaPicker", "getBestMatch", new Object[0]);
        for (Pair<m, n> pair2 : list) {
            String type = ((n) pair2.second).getType();
            if (type != null && type.matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)")) {
                n nVar = (n) pair2.second;
                if ((nVar.getWidth() > nVar.getHeight()) == this.f90736c) {
                    return pair2;
                }
                if (pair == null) {
                    pair = pair2;
                }
            }
        }
        return pair;
    }

    public b(int i10, int i11) {
        this.f90735b = i10 * i11;
    }
}
