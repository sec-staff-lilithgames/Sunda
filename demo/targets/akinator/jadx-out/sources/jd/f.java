package jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f {
    public static <T> f ofData(int i10, T t10, i iVar, g gVar) {
        return new a(Integer.valueOf(i10), t10, h.f69502b, iVar, gVar);
    }

    public static <T> f ofTelemetry(int i10, T t10, i iVar, g gVar) {
        return new a(Integer.valueOf(i10), t10, h.f69503c, iVar, gVar);
    }

    public static <T> f ofUrgent(int i10, T t10, i iVar, g gVar) {
        return new a(Integer.valueOf(i10), t10, h.f69504e, iVar, gVar);
    }

    public abstract Integer getCode();

    public abstract g getEventContext();

    public abstract Object getPayload();

    public abstract h getPriority();

    public abstract i getProductData();

    public static <T> f ofData(int i10, T t10, i iVar) {
        return new a(Integer.valueOf(i10), t10, h.f69502b, iVar, null);
    }

    public static <T> f ofTelemetry(int i10, T t10, i iVar) {
        return new a(Integer.valueOf(i10), t10, h.f69503c, iVar, null);
    }

    public static <T> f ofUrgent(int i10, T t10, i iVar) {
        return new a(Integer.valueOf(i10), t10, h.f69504e, iVar, null);
    }

    public static <T> f ofData(int i10, T t10, g gVar) {
        return new a(Integer.valueOf(i10), t10, h.f69502b, null, gVar);
    }

    public static <T> f ofTelemetry(int i10, T t10, g gVar) {
        return new a(Integer.valueOf(i10), t10, h.f69503c, null, gVar);
    }

    public static <T> f ofUrgent(int i10, T t10, g gVar) {
        return new a(Integer.valueOf(i10), t10, h.f69504e, null, gVar);
    }

    public static <T> f ofData(int i10, T t10) {
        return new a(Integer.valueOf(i10), t10, h.f69502b, null, null);
    }

    public static <T> f ofTelemetry(int i10, T t10) {
        return new a(Integer.valueOf(i10), t10, h.f69503c, null, null);
    }

    public static <T> f ofUrgent(int i10, T t10) {
        return new a(Integer.valueOf(i10), t10, h.f69504e, null, null);
    }

    public static <T> f ofData(T t10, i iVar, g gVar) {
        return new a(null, t10, h.f69502b, iVar, gVar);
    }

    public static <T> f ofTelemetry(T t10, i iVar, g gVar) {
        return new a(null, t10, h.f69503c, iVar, gVar);
    }

    public static <T> f ofUrgent(T t10, i iVar, g gVar) {
        return new a(null, t10, h.f69504e, iVar, gVar);
    }

    public static <T> f ofData(T t10, i iVar) {
        return new a(null, t10, h.f69502b, iVar, null);
    }

    public static <T> f ofTelemetry(T t10, i iVar) {
        return new a(null, t10, h.f69503c, iVar, null);
    }

    public static <T> f ofUrgent(T t10, i iVar) {
        return new a(null, t10, h.f69504e, iVar, null);
    }

    public static <T> f ofData(T t10, g gVar) {
        return new a(null, t10, h.f69502b, null, gVar);
    }

    public static <T> f ofTelemetry(T t10, g gVar) {
        return new a(null, t10, h.f69503c, null, gVar);
    }

    public static <T> f ofUrgent(T t10, g gVar) {
        return new a(null, t10, h.f69504e, null, gVar);
    }

    public static <T> f ofData(T t10) {
        return new a(null, t10, h.f69502b, null, null);
    }

    public static <T> f ofTelemetry(T t10) {
        return new a(null, t10, h.f69503c, null, null);
    }

    public static <T> f ofUrgent(T t10) {
        return new a(null, t10, h.f69504e, null, null);
    }
}
