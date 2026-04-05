package kotlinx.serialization.internal;

import aw.f;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import qv.v;
import tu.o;
import tu.q;
import tu.s;
import uu.p0;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {
    private final o _hashCode$delegate;
    private int added;
    private final o childSerializers$delegate;
    private List<Annotation> classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    private final GeneratedSerializer<?> generatedSerializer;
    private Map<String, Integer> indices;
    private final String[] names;
    private final List<Annotation>[] propertiesAnnotations;
    private final String serialName;
    private final o typeParameterDescriptors$delegate;

    public PluginGeneratedSerialDescriptor(String serialName, GeneratedSerializer<?> generatedSerializer, int i10) {
        e0.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = i10;
        this.added = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i12 = this.elementsCount;
        this.propertiesAnnotations = new List[i12];
        this.elementsOptionality = new boolean[i12];
        this.indices = p1.emptyMap();
        s sVar = s.f87404c;
        final int i13 = 0;
        this.childSerializers$delegate = q.lazy(sVar, new kv.a(this) { // from class: kotlinx.serialization.internal.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f71920c;

            {
                this.f71920c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f71920c);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f71920c);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f71920c));
                }
            }
        });
        final int i14 = 1;
        this.typeParameterDescriptors$delegate = q.lazy(sVar, new kv.a(this) { // from class: kotlinx.serialization.internal.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f71920c;

            {
                this.f71920c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f71920c);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f71920c);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f71920c));
                }
            }
        });
        final int i15 = 2;
        this._hashCode$delegate = q.lazy(sVar, new kv.a(this) { // from class: kotlinx.serialization.internal.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f71920c;

            {
                this.f71920c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(this.f71920c);
                    case 1:
                        return PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(this.f71920c);
                    default:
                        return Integer.valueOf(PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(this.f71920c));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z10);
    }

    private final Map<String, Integer> buildIndices() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.names[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<?>[] kSerializerArrChildSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        return (generatedSerializer == null || (kSerializerArrChildSerializers = generatedSerializer.childSerializers()) == null) ? PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : kSerializerArrChildSerializers;
    }

    private final KSerializer<?>[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers$delegate.getValue();
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$6(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i10) {
        return pluginGeneratedSerialDescriptor.getElementName(i10) + ": " + pluginGeneratedSerialDescriptor.getElementDescriptor(i10).getSerialName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        if (generatedSerializer == null || (kSerializerArrTypeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return Platform_commonKt.compactArray(arrayList);
    }

    public final void addElement(String name, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        int i10 = this.added + 1;
        this.added = i10;
        strArr[i10] = name;
        this.elementsOptionality[i10] = z10;
        this.propertiesAnnotations[i10] = null;
        if (i10 == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginGeneratedSerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!e0.areEqual(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) obj).getTypeParameterDescriptors$kotlinx_serialization_core()) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            if (!e0.areEqual(getElementDescriptor(i10).getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) || !e0.areEqual(getElementDescriptor(i10).getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? p0.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int i10) {
        List<Annotation> list = this.propertiesAnnotations[i10];
        return list == null ? p0.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i10) {
        return getChildSerializers()[i10].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        e0.checkNotNullParameter(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i10) {
        return this.names[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors$delegate.getValue();
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        return this.elementsOptionality[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    public final void pushAnnotation(Annotation annotation) {
        e0.checkNotNullParameter(annotation, "annotation");
        List<Annotation> arrayList = this.propertiesAnnotations[this.added];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.propertiesAnnotations[this.added] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(Annotation a10) {
        e0.checkNotNullParameter(a10, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        e0.checkNotNull(list);
        list.add(a10);
    }

    public String toString() {
        return y0.joinToString$default(v.until(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, null, new f(this, 21), 24, null);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i10, int i11, u uVar) {
        this(str, (i11 & 2) != 0 ? null : generatedSerializer, i10);
    }
}
