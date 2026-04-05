package gx;

import java.io.IOException;
import retrofit2.Converter;
import uw.p;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Class f58522a;

    /* renamed from: b, reason: collision with root package name */
    public final p f58523b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58524c;

    public c(Class cls, p pVar, boolean z10) {
        this.f58522a = cls;
        this.f58523b = pVar;
        this.f58524c = z10;
    }

    @Override // retrofit2.Converter
    public Object convert(w0 w0Var) throws IOException {
        Class cls = this.f58522a;
        try {
            try {
                Object obj = this.f58523b.read((Class<? extends Object>) cls, w0Var.charStream(), this.f58524c);
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException("Could not deserialize body as " + cls);
            } catch (IOException e10) {
                throw e10;
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        } finally {
            w0Var.close();
        }
    }
}
