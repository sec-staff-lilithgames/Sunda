package io.ktor.http;

import io.ktor.http.Headers;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kv.p;
import tu.f;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes7.dex */
public final class EmptyHeaders implements Headers {
    public static final EmptyHeaders INSTANCE = new EmptyHeaders();

    private EmptyHeaders() {
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String str) {
        return Headers.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public Set<Map.Entry<String, List<String>>> entries() {
        return c2.emptySet();
    }

    @Override // io.ktor.util.StringValues
    public void forEach(p pVar) {
        Headers.DefaultImpls.forEach(this, pVar);
    }

    @Override // io.ktor.util.StringValues
    public String get(String str) {
        return Headers.DefaultImpls.get(this, str);
    }

    @Override // io.ktor.util.StringValues
    public List<String> getAll(String name) {
        e0.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public Set<String> names() {
        return c2.emptySet();
    }

    public String toString() {
        return "Headers " + entries();
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String str, String str2) {
        return Headers.DefaultImpls.contains(this, str, str2);
    }
}
