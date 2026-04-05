package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class P8 {
    public static Q8 a() {
        synchronized (Q8.f32165d) {
            Q8 q82 = Q8.f32166e;
            if (q82 == null) {
                return new Q8();
            }
            Q8.f32166e = q82.f32170c;
            q82.f32170c = null;
            Q8.f32167f--;
            return q82;
        }
    }
}
