package vw;

import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q3 implements uw.p {

    /* renamed from: a, reason: collision with root package name */
    public final m4 f90052a;

    /* renamed from: b, reason: collision with root package name */
    public final xw.d f90053b;

    /* renamed from: c, reason: collision with root package name */
    public final v4 f90054c;

    /* renamed from: d, reason: collision with root package name */
    public final yw.j f90055d;

    public q3() {
        this(new HashMap());
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, String str) throws Exception {
        return (T) read((Class) cls, str, true);
    }

    @Override // uw.p
    public boolean validate(Class cls, String str) throws Exception {
        return validate(cls, str, true);
    }

    @Override // uw.p
    public void write(Object obj, yw.h0 h0Var) throws Exception {
        m4 m4Var = this.f90052a;
        try {
            new g5(new s4(this.f90053b, this.f90054c, m4Var.open())).write(h0Var, obj);
        } finally {
            m4Var.close();
        }
    }

    public q3(yw.j jVar) {
        this(new xw.e(), jVar);
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, File file) throws Exception {
        return (T) read((Class) cls, file, true);
    }

    @Override // uw.p
    public boolean validate(Class cls, File file) throws Exception {
        return validate(cls, file, true);
    }

    public q3(Map map) {
        this(new ww.d(map));
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, InputStream inputStream) throws Exception {
        return (T) read((Class) cls, inputStream, true);
    }

    @Override // uw.p
    public boolean validate(Class cls, InputStream inputStream) throws Exception {
        return validate(cls, inputStream, true);
    }

    public q3(Map map, yw.j jVar) {
        this(new ww.d(map));
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, Reader reader) throws Exception {
        return (T) read((Class) cls, reader, true);
    }

    @Override // uw.p
    public boolean validate(Class cls, Reader reader) throws Exception {
        return validate(cls, reader, true);
    }

    public q3(ww.b bVar) {
        this(new xw.e(), bVar);
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, yw.p pVar) throws Exception {
        return (T) read((Class) cls, pVar, true);
    }

    @Override // uw.p
    public boolean validate(Class cls, yw.p pVar) throws Exception {
        return validate(cls, pVar, true);
    }

    @Override // uw.p
    public void write(Object obj, File file) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            write(obj, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    public q3(ww.b bVar, yw.j jVar) {
        this(new xw.e(), bVar, jVar);
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, String str, boolean z10) throws Exception {
        return (T) read((Class) cls, (Reader) new StringReader(str), z10);
    }

    @Override // uw.p
    public boolean validate(Class cls, String str, boolean z10) throws Exception {
        return validate(cls, new StringReader(str), z10);
    }

    public q3(zw.a0 a0Var) {
        this(new xw.e(), a0Var);
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, File file, boolean z10) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return (T) read((Class) cls, (InputStream) fileInputStream, z10);
        } finally {
            fileInputStream.close();
        }
    }

    @Override // uw.p
    public boolean validate(Class cls, File file, boolean z10) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return validate(cls, fileInputStream, z10);
        } finally {
            fileInputStream.close();
        }
    }

    public q3(zw.a0 a0Var, yw.j jVar) {
        this(new xw.e(), a0Var, jVar);
    }

    @Override // uw.p
    public void write(Object obj, OutputStream outputStream) throws Exception {
        write(obj, outputStream, G5.N);
    }

    public q3(xw.d dVar) {
        this(dVar, new HashMap());
    }

    public void write(Object obj, OutputStream outputStream, String str) throws Exception {
        write(obj, new OutputStreamWriter(outputStream, str));
    }

    public q3(xw.d dVar, yw.j jVar) {
        this(dVar, new HashMap(), jVar);
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, InputStream inputStream, boolean z10) throws Exception {
        return (T) read((Class) cls, yw.w.read(inputStream), z10);
    }

    @Override // uw.p
    public boolean validate(Class cls, InputStream inputStream, boolean z10) throws Exception {
        return validate(cls, yw.w.read(inputStream), z10);
    }

    @Override // uw.p
    public void write(Object obj, Writer writer) throws Exception {
        write(obj, yw.w.write(writer, this.f90055d));
    }

    public q3(ww.b bVar, zw.a0 a0Var) {
        this(new xw.e(), bVar, a0Var);
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, Reader reader, boolean z10) throws Exception {
        return (T) read((Class) cls, yw.w.read(reader), z10);
    }

    @Override // uw.p
    public boolean validate(Class cls, Reader reader, boolean z10) throws Exception {
        return validate(cls, yw.w.read(reader), z10);
    }

    public q3(ww.b bVar, zw.a0 a0Var, yw.j jVar) {
        this(new xw.e(), bVar, a0Var, jVar);
    }

    @Override // uw.p
    public <T> T read(Class<? extends T> cls, yw.p pVar, boolean z10) throws Exception {
        m4 m4Var = this.f90052a;
        try {
            return (T) new g5(new s4(this.f90053b, this.f90054c, m4Var.open(z10))).read(pVar, (Class) cls);
        } finally {
            m4Var.close();
        }
    }

    @Override // uw.p
    public boolean validate(Class cls, yw.p pVar, boolean z10) throws Exception {
        m4 m4Var = this.f90052a;
        try {
            return new g5(new s4(this.f90053b, this.f90054c, m4Var.open(z10))).validate(pVar, cls);
        } finally {
            m4Var.close();
        }
    }

    public q3(xw.d dVar, Map map) {
        this(dVar, new ww.d(map));
    }

    public q3(xw.d dVar, Map map, yw.j jVar) {
        this(dVar, new ww.d(map), jVar);
    }

    public q3(xw.d dVar, ww.b bVar) {
        this(dVar, bVar, new yw.j());
    }

    public q3(xw.d dVar, ww.b bVar, yw.j jVar) {
        this(dVar, bVar, new m1(), jVar);
    }

    @Override // uw.p
    public <T> T read(T t10, String str) throws Exception {
        return (T) read((q3) t10, str, true);
    }

    @Override // uw.p
    public <T> T read(T t10, File file) throws Exception {
        return (T) read((q3) t10, file, true);
    }

    @Override // uw.p
    public <T> T read(T t10, InputStream inputStream) throws Exception {
        return (T) read((q3) t10, inputStream, true);
    }

    public q3(xw.d dVar, zw.a0 a0Var) {
        this(dVar, new ww.d(), a0Var);
    }

    @Override // uw.p
    public <T> T read(T t10, Reader reader) throws Exception {
        return (T) read((q3) t10, reader, true);
    }

    public q3(xw.d dVar, zw.a0 a0Var, yw.j jVar) {
        this(dVar, new ww.d(), a0Var, jVar);
    }

    @Override // uw.p
    public <T> T read(T t10, yw.p pVar) throws Exception {
        return (T) read((q3) t10, pVar, true);
    }

    public q3(xw.d dVar, ww.b bVar, zw.a0 a0Var) {
        this(dVar, bVar, a0Var, new yw.j());
    }

    @Override // uw.p
    public <T> T read(T t10, String str, boolean z10) throws Exception {
        return (T) read((q3) t10, (Reader) new StringReader(str), z10);
    }

    public q3(xw.d dVar, ww.b bVar, zw.a0 a0Var, yw.j jVar) {
        this.f90054c = new v4(bVar, a0Var, jVar);
        this.f90052a = new m4();
        this.f90053b = dVar;
        this.f90055d = jVar;
    }

    @Override // uw.p
    public <T> T read(T t10, File file, boolean z10) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return (T) read((q3) t10, (InputStream) fileInputStream, z10);
        } finally {
            fileInputStream.close();
        }
    }

    @Override // uw.p
    public <T> T read(T t10, InputStream inputStream, boolean z10) throws Exception {
        return (T) read((q3) t10, yw.w.read(inputStream), z10);
    }

    @Override // uw.p
    public <T> T read(T t10, Reader reader, boolean z10) throws Exception {
        return (T) read((q3) t10, yw.w.read(reader), z10);
    }

    @Override // uw.p
    public <T> T read(T t10, yw.p pVar, boolean z10) throws Exception {
        m4 m4Var = this.f90052a;
        try {
            return (T) new g5(new s4(this.f90053b, this.f90054c, m4Var.open(z10))).read(pVar, t10);
        } finally {
            m4Var.close();
        }
    }
}
