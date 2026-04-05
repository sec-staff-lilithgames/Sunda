package cd;

import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeVariable[] f12168a = AbstractList.class.getTypeParameters();

    /* renamed from: b, reason: collision with root package name */
    public static final TypeVariable[] f12169b = Collection.class.getTypeParameters();

    /* renamed from: c, reason: collision with root package name */
    public static final TypeVariable[] f12170c = Iterable.class.getTypeParameters();

    /* renamed from: d, reason: collision with root package name */
    public static final TypeVariable[] f12171d = List.class.getTypeParameters();

    /* renamed from: e, reason: collision with root package name */
    public static final TypeVariable[] f12172e = ArrayList.class.getTypeParameters();

    /* renamed from: f, reason: collision with root package name */
    public static final TypeVariable[] f12173f = Map.class.getTypeParameters();

    /* renamed from: g, reason: collision with root package name */
    public static final TypeVariable[] f12174g = HashMap.class.getTypeParameters();

    /* renamed from: h, reason: collision with root package name */
    public static final TypeVariable[] f12175h = LinkedHashMap.class.getTypeParameters();

    public static TypeVariable<?>[] paramsFor1(Class<?> cls) {
        return cls == Collection.class ? f12169b : cls == List.class ? f12171d : cls == ArrayList.class ? f12172e : cls == AbstractList.class ? f12168a : cls == Iterable.class ? f12170c : cls.getTypeParameters();
    }

    public static TypeVariable<?>[] paramsFor2(Class<?> cls) {
        return cls == Map.class ? f12173f : cls == HashMap.class ? f12174g : cls == LinkedHashMap.class ? f12175h : cls.getTypeParameters();
    }
}
