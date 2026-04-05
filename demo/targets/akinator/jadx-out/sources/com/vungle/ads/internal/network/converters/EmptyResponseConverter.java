package com.vungle.ads.internal.network.converters;

import gv.d;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class EmptyResponseConverter implements Converter<w0, Void> {
    @Override // com.vungle.ads.internal.network.converters.Converter
    public Void convert(w0 w0Var) {
        if (w0Var != null) {
            try {
                w0Var.close();
                d.closeFinally(w0Var, null);
            } finally {
            }
        }
        return null;
    }
}
