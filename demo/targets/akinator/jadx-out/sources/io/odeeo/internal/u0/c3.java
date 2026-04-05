package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c3 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Field f66608a;

        public void a(T t10, Object obj) throws IllegalAccessException, IllegalArgumentException {
            try {
                this.f66608a.set(t10, obj);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        public b(Field field) throws SecurityException {
            this.f66608a = field;
            field.setAccessible(true);
        }

        public void a(T t10, int i10) throws IllegalAccessException, IllegalArgumentException {
            try {
                this.f66608a.set(t10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static int a(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    public static <E> void a(h2<E> h2Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(h2Var.entrySet().size());
        for (h2.a<E> aVar : h2Var.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void a(h2<E> h2Var, ObjectInputStream objectInputStream, int i10) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < i10; i11++) {
            h2Var.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <K, V> void a(e2<K, V> e2Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(e2Var.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : e2Var.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }
}
