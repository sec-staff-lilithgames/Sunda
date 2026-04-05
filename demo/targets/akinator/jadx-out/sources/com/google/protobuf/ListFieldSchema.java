package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@CheckReturnValue
/* loaded from: classes7.dex */
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE;
    private static final ListFieldSchema LITE_INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        public static <E> List<E> getList(Object obj, long j10) {
            return (List) UnsafeUtil.getObject(obj, j10);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.getObject(obj, j10);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
            List list = getList(obj2, j10);
            List listMutableListAt = mutableListAt(obj, j10, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            UnsafeUtil.putObject(obj, j10, list);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j10) {
            return mutableListAt(obj, j10, 10);
        }

        private static <L> List<L> mutableListAt(Object obj, long j10, int i10) {
            List<L> list = getList(obj, j10);
            if (list.isEmpty()) {
                List<L> lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i10) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i10) : new ArrayList<>(i10);
                UnsafeUtil.putObject(obj, j10, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i10);
                arrayList.addAll(list);
                UnsafeUtil.putObject(obj, j10, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i10);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(obj, j10, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i10);
                    UnsafeUtil.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
                    return protobufListMutableCopyWithCapacity2;
                }
            }
            return list;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j10) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j10);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j10) {
            getProtobufList(obj, j10).makeImmutable();
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j10);
            Internal.ProtobufList protobufList2 = getProtobufList(obj2, j10);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            UnsafeUtil.putObject(obj, j10, protobufList2);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j10) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j10);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            UnsafeUtil.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
            return protobufListMutableCopyWithCapacity2;
        }
    }

    static {
        FULL_INSTANCE = new ListFieldSchemaFull();
        LITE_INSTANCE = new ListFieldSchemaLite();
    }

    public static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    public static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j10);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j10);

    public abstract <L> List<L> mutableListAt(Object obj, long j10);

    private ListFieldSchema() {
    }
}
