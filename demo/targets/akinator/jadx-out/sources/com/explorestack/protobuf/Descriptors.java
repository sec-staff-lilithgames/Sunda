package com.explorestack.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.TextFormat;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import cv.BLca.YsiBvdpw;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Descriptors {
    private static final Logger logger = Logger.getLogger(Descriptors.class.getName());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.explorestack.protobuf.Descriptors$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[FieldDescriptor.JavaType.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = iArr;
            try {
                iArr[FieldDescriptor.JavaType.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[FieldDescriptor.JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr2;
            try {
                iArr2[FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED64.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BOOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Descriptor extends GenericDescriptor {
        private final Descriptor containingType;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final Descriptor[] nestedTypes;
        private final OneofDescriptor[] oneofs;
        private b1 proto;
        private final int realOneofCount;

        public /* synthetic */ Descriptor(b1 b1Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10, AnonymousClass1 anonymousClass1) throws DescriptorValidationException {
            this(b1Var, fileDescriptor, descriptor, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            for (Descriptor descriptor : this.nestedTypes) {
                descriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.fields) {
                fieldDescriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor2 : this.extensions) {
                fieldDescriptor2.crossLink();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(b1 b1Var) {
            this.proto = b1Var;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                Descriptor[] descriptorArr = this.nestedTypes;
                if (i11 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i11].setProto(b1Var.getNestedType(i11));
                i11++;
            }
            int i12 = 0;
            while (true) {
                OneofDescriptor[] oneofDescriptorArr = this.oneofs;
                if (i12 >= oneofDescriptorArr.length) {
                    break;
                }
                oneofDescriptorArr[i12].setProto(b1Var.getOneofDecl(i12));
                i12++;
            }
            int i13 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i13 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i13].setProto(b1Var.getEnumType(i13));
                i13++;
            }
            int i14 = 0;
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.fields;
                if (i14 >= fieldDescriptorArr.length) {
                    break;
                }
                fieldDescriptorArr[i14].setProto(b1Var.getField(i14));
                i14++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr2 = this.extensions;
                if (i10 >= fieldDescriptorArr2.length) {
                    return;
                }
                fieldDescriptorArr2[i10].setProto(b1Var.getExtension(i10));
                i10++;
            }
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof EnumDescriptor) {
                return (EnumDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof FieldDescriptor) {
                return (FieldDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByNumber(int i10) {
            return (FieldDescriptor) this.file.pool.fieldsByNumber.get(new DescriptorPool.DescriptorIntPair(this, i10));
        }

        public Descriptor findNestedTypeByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof Descriptor) {
                return (Descriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public List<Descriptor> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.nestedTypes));
        }

        public List<OneofDescriptor> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs));
        }

        public g3 getOptions() {
            return this.proto.getOptions();
        }

        public List<OneofDescriptor> getRealOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs).subList(0, this.realOneofCount));
        }

        public boolean isExtendable() {
            return !this.proto.getExtensionRangeList().isEmpty();
        }

        public boolean isExtensionNumber(int i10) {
            for (v0 v0Var : this.proto.getExtensionRangeList()) {
                if (v0Var.getStart() <= i10 && i10 < v0Var.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedName(String str) {
            Charset charset = x7.f22881a;
            str.getClass();
            Iterator it = this.proto.getReservedNameList().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i10) {
            for (z0 z0Var : this.proto.getReservedRangeList()) {
                if (z0Var.getStart() <= i10 && i10 < z0Var.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public Descriptor(String str) throws DescriptorValidationException {
            String strSubstring;
            String strSubstring2;
            super(null);
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring2 = str.substring(iLastIndexOf + 1);
                strSubstring = str.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
                strSubstring2 = str;
            }
            this.index = 0;
            this.proto = b1.newBuilder().setName(strSubstring2).addExtensionRange(v0.newBuilder().setStart(1).setEnd(536870912).build()).build();
            this.fullName = str;
            this.containingType = null;
            this.nestedTypes = new Descriptor[0];
            this.enumTypes = new EnumDescriptor[0];
            this.fields = new FieldDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            this.oneofs = new OneofDescriptor[0];
            this.realOneofCount = 0;
            this.file = new FileDescriptor(strSubstring, this);
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public b1 toProto() {
            return this.proto;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Descriptor(b1 b1Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10) throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.index = i10;
            this.proto = b1Var;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, b1Var.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            this.oneofs = new OneofDescriptor[b1Var.getOneofDeclCount()];
            for (int i11 = 0; i11 < b1Var.getOneofDeclCount(); i11++) {
                this.oneofs[i11] = new OneofDescriptor(b1Var.getOneofDecl(i11), fileDescriptor, this, i11, null);
            }
            this.nestedTypes = new Descriptor[b1Var.getNestedTypeCount()];
            for (int i12 = 0; i12 < b1Var.getNestedTypeCount(); i12++) {
                this.nestedTypes[i12] = new Descriptor(b1Var.getNestedType(i12), fileDescriptor, this, i12);
            }
            this.enumTypes = new EnumDescriptor[b1Var.getEnumTypeCount()];
            for (int i13 = 0; i13 < b1Var.getEnumTypeCount(); i13++) {
                this.enumTypes[i13] = new EnumDescriptor(b1Var.getEnumType(i13), fileDescriptor, this, i13, null);
            }
            this.fields = new FieldDescriptor[b1Var.getFieldCount()];
            for (int i14 = 0; i14 < b1Var.getFieldCount(); i14++) {
                this.fields[i14] = new FieldDescriptor(b1Var.getField(i14), fileDescriptor, this, i14, false, null);
            }
            this.extensions = new FieldDescriptor[b1Var.getExtensionCount()];
            for (int i15 = 0; i15 < b1Var.getExtensionCount(); i15++) {
                this.extensions[i15] = new FieldDescriptor(b1Var.getExtension(i15), fileDescriptor, this, i15, true, null);
            }
            for (int i16 = 0; i16 < b1Var.getOneofDeclCount(); i16++) {
                OneofDescriptor oneofDescriptor = this.oneofs[i16];
                oneofDescriptor.fields = new FieldDescriptor[oneofDescriptor.getFieldCount()];
                this.oneofs[i16].fieldCount = 0;
            }
            for (int i17 = 0; i17 < b1Var.getFieldCount(); i17++) {
                OneofDescriptor containingOneof = this.fields[i17].getContainingOneof();
                if (containingOneof != null) {
                    containingOneof.fields[OneofDescriptor.access$2008(containingOneof)] = this.fields[i17];
                }
            }
            int i18 = 0;
            for (OneofDescriptor oneofDescriptor2 : this.oneofs) {
                if (oneofDescriptor2.isSynthetic()) {
                    i18++;
                } else if (i18 > 0) {
                    throw new DescriptorValidationException(this, "Synthetic oneofs must come last.", anonymousClass1);
                }
            }
            this.realOneofCount = this.oneofs.length - i18;
            fileDescriptor.pool.addSymbol(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DescriptorPool {
        private boolean allowUnknownDependencies;
        private final Map<String, GenericDescriptor> descriptorsByName = new HashMap();
        private final Map<DescriptorIntPair, FieldDescriptor> fieldsByNumber = new HashMap();
        private final Map<DescriptorIntPair, EnumValueDescriptor> enumValuesByNumber = new HashMap();
        private final Set<FileDescriptor> dependencies = new HashSet();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DescriptorIntPair {
            private final GenericDescriptor descriptor;
            private final int number;

            public DescriptorIntPair(GenericDescriptor genericDescriptor, int i10) {
                this.descriptor = genericDescriptor;
                this.number = i10;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof DescriptorIntPair)) {
                    return false;
                }
                DescriptorIntPair descriptorIntPair = (DescriptorIntPair) obj;
                return this.descriptor == descriptorIntPair.descriptor && this.number == descriptorIntPair.number;
            }

            public int hashCode() {
                return (this.descriptor.hashCode() * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.number;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PackageDescriptor extends GenericDescriptor {
            private final FileDescriptor file;
            private final String fullName;
            private final String name;

            public PackageDescriptor(String str, String str2, FileDescriptor fileDescriptor) {
                super(null);
                this.file = fileDescriptor;
                this.fullName = str2;
                this.name = str;
            }

            @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
            public FileDescriptor getFile() {
                return this.file;
            }

            @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
            public String getFullName() {
                return this.fullName;
            }

            @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
            public String getName() {
                return this.name;
            }

            @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
            public Message toProto() {
                return this.file.toProto();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum SearchFilter {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        public DescriptorPool(FileDescriptor[] fileDescriptorArr, boolean z10) {
            this.allowUnknownDependencies = z10;
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                this.dependencies.add(fileDescriptor);
                importPublicDependencies(fileDescriptor);
            }
            for (FileDescriptor fileDescriptor2 : this.dependencies) {
                try {
                    addPackage(fileDescriptor2.getPackage(), fileDescriptor2);
                } catch (DescriptorValidationException e10) {
                    throw new AssertionError(e10);
                }
            }
        }

        private void importPublicDependencies(FileDescriptor fileDescriptor) {
            for (FileDescriptor fileDescriptor2 : fileDescriptor.getPublicDependencies()) {
                if (this.dependencies.add(fileDescriptor2)) {
                    importPublicDependencies(fileDescriptor2);
                }
            }
        }

        public static void validateSymbolName(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            String name = genericDescriptor.getName();
            AnonymousClass1 anonymousClass1 = null;
            if (name.length() == 0) {
                throw new DescriptorValidationException(genericDescriptor, "Missing name.", anonymousClass1);
            }
            for (int i10 = 0; i10 < name.length(); i10++) {
                char cCharAt = name.charAt(i10);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i10 <= 0))) {
                    throw new DescriptorValidationException(genericDescriptor, a.b.l("\"", name, "\" is not a valid identifier."), anonymousClass1);
                }
            }
        }

        public void addEnumValueByNumber(EnumValueDescriptor enumValueDescriptor) {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(enumValueDescriptor.getType(), enumValueDescriptor.getNumber());
            EnumValueDescriptor enumValueDescriptorPut = this.enumValuesByNumber.put(descriptorIntPair, enumValueDescriptor);
            if (enumValueDescriptorPut != null) {
                this.enumValuesByNumber.put(descriptorIntPair, enumValueDescriptorPut);
            }
        }

        public void addPackage(String str, FileDescriptor fileDescriptor) throws DescriptorValidationException {
            String strSubstring;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                strSubstring = str;
            } else {
                addPackage(str.substring(0, iLastIndexOf), fileDescriptor);
                strSubstring = str.substring(iLastIndexOf + 1);
            }
            GenericDescriptor genericDescriptorPut = this.descriptorsByName.put(str, new PackageDescriptor(strSubstring, str, fileDescriptor));
            if (genericDescriptorPut != null) {
                this.descriptorsByName.put(str, genericDescriptorPut);
                if (genericDescriptorPut instanceof PackageDescriptor) {
                    return;
                }
                StringBuilder sbO = e3.g.o("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
                sbO.append(genericDescriptorPut.getFile().getName());
                sbO.append("\".");
                throw new DescriptorValidationException(fileDescriptor, sbO.toString(), (AnonymousClass1) null);
            }
        }

        public void addSymbol(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            validateSymbolName(genericDescriptor);
            String fullName = genericDescriptor.getFullName();
            GenericDescriptor genericDescriptorPut = this.descriptorsByName.put(fullName, genericDescriptor);
            if (genericDescriptorPut != null) {
                this.descriptorsByName.put(fullName, genericDescriptorPut);
                AnonymousClass1 anonymousClass1 = null;
                if (genericDescriptor.getFile() != genericDescriptorPut.getFile()) {
                    StringBuilder sbO = e3.g.o("\"", fullName, "\" is already defined in file \"");
                    sbO.append(genericDescriptorPut.getFile().getName());
                    sbO.append("\".");
                    throw new DescriptorValidationException(genericDescriptor, sbO.toString(), anonymousClass1);
                }
                int iLastIndexOf = fullName.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    throw new DescriptorValidationException(genericDescriptor, a.b.l("\"", fullName, "\" is already defined."), anonymousClass1);
                }
                throw new DescriptorValidationException(genericDescriptor, "\"" + fullName.substring(iLastIndexOf + 1) + "\" is already defined in \"" + fullName.substring(0, iLastIndexOf) + "\".", anonymousClass1);
            }
        }

        public GenericDescriptor findSymbol(String str) {
            return findSymbol(str, SearchFilter.ALL_SYMBOLS);
        }

        public boolean isAggregate(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor) || (genericDescriptor instanceof PackageDescriptor) || (genericDescriptor instanceof ServiceDescriptor);
        }

        public boolean isType(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor);
        }

        public GenericDescriptor lookupSymbol(String str, GenericDescriptor genericDescriptor, SearchFilter searchFilter) throws DescriptorValidationException {
            GenericDescriptor genericDescriptorFindSymbol;
            String string;
            if (str.startsWith(".")) {
                string = str.substring(1);
                genericDescriptorFindSymbol = findSymbol(string, searchFilter);
            } else {
                int iIndexOf = str.indexOf(46);
                String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
                StringBuilder sb2 = new StringBuilder(genericDescriptor.getFullName());
                while (true) {
                    int iLastIndexOf = sb2.lastIndexOf(".");
                    if (iLastIndexOf == -1) {
                        genericDescriptorFindSymbol = findSymbol(str, searchFilter);
                        string = str;
                        break;
                    }
                    int i10 = iLastIndexOf + 1;
                    sb2.setLength(i10);
                    sb2.append(strSubstring);
                    GenericDescriptor genericDescriptorFindSymbol2 = findSymbol(sb2.toString(), SearchFilter.AGGREGATES_ONLY);
                    if (genericDescriptorFindSymbol2 != null) {
                        if (iIndexOf != -1) {
                            sb2.setLength(i10);
                            sb2.append(str);
                            genericDescriptorFindSymbol = findSymbol(sb2.toString(), searchFilter);
                        } else {
                            genericDescriptorFindSymbol = genericDescriptorFindSymbol2;
                        }
                        string = sb2.toString();
                    } else {
                        sb2.setLength(iLastIndexOf);
                    }
                }
            }
            if (genericDescriptorFindSymbol != null) {
                return genericDescriptorFindSymbol;
            }
            if (!this.allowUnknownDependencies || searchFilter != SearchFilter.TYPES_ONLY) {
                throw new DescriptorValidationException(genericDescriptor, a.b.l("\"", str, "\" is not defined."), (AnonymousClass1) null);
            }
            Descriptors.logger.warning("The descriptor for message type \"" + str + "\" can not be found and a placeholder is created for it");
            Descriptor descriptor = new Descriptor(string);
            this.dependencies.add(descriptor.getFile());
            return descriptor;
        }

        public void addFieldByNumber(FieldDescriptor fieldDescriptor) throws DescriptorValidationException {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(fieldDescriptor.getContainingType(), fieldDescriptor.getNumber());
            FieldDescriptor fieldDescriptorPut = this.fieldsByNumber.put(descriptorIntPair, fieldDescriptor);
            if (fieldDescriptorPut == null) {
                return;
            }
            this.fieldsByNumber.put(descriptorIntPair, fieldDescriptorPut);
            throw new DescriptorValidationException(fieldDescriptor, "Field number " + fieldDescriptor.getNumber() + " has already been used in \"" + fieldDescriptor.getContainingType().getFullName() + "\" by field \"" + fieldDescriptorPut.getName() + NyKZx.FbZTynFw, (AnonymousClass1) null);
        }

        public GenericDescriptor findSymbol(String str, SearchFilter searchFilter) {
            GenericDescriptor genericDescriptor = this.descriptorsByName.get(str);
            if (genericDescriptor != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor))))) {
                return genericDescriptor;
            }
            Iterator<FileDescriptor> it = this.dependencies.iterator();
            while (it.hasNext()) {
                GenericDescriptor genericDescriptor2 = it.next().pool.descriptorsByName.get(str);
                if (genericDescriptor2 != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor2)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor2))))) {
                    return genericDescriptor2;
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final Message proto;

        public /* synthetic */ DescriptorValidationException(FileDescriptor fileDescriptor, String str, AnonymousClass1 anonymousClass1) {
            this(fileDescriptor, str);
        }

        public String getDescription() {
            return this.description;
        }

        public Message getProblemProto() {
            return this.proto;
        }

        public String getProblemSymbolName() {
            return this.name;
        }

        public /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, AnonymousClass1 anonymousClass1) {
            this(genericDescriptor, str);
        }

        public /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th2, AnonymousClass1 anonymousClass1) {
            this(genericDescriptor, str, th2);
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str) {
            super(genericDescriptor.getFullName() + ": " + str);
            this.name = genericDescriptor.getFullName();
            this.proto = genericDescriptor.toProto();
            this.description = str;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th2) {
            this(genericDescriptor, str);
            initCause(th2);
        }

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            super(fileDescriptor.getName() + ": " + str);
            this.name = fileDescriptor.getName();
            this.proto = fileDescriptor.toProto();
            this.description = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EnumDescriptor extends GenericDescriptor implements p7 {
        private final Descriptor containingType;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private j1 proto;
        private final WeakHashMap<Integer, WeakReference<EnumValueDescriptor>> unknownValues;
        private EnumValueDescriptor[] values;

        public /* synthetic */ EnumDescriptor(j1 j1Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10, AnonymousClass1 anonymousClass1) throws DescriptorValidationException {
            this(j1Var, fileDescriptor, descriptor, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(j1 j1Var) {
            this.proto = j1Var;
            int i10 = 0;
            while (true) {
                EnumValueDescriptor[] enumValueDescriptorArr = this.values;
                if (i10 >= enumValueDescriptorArr.length) {
                    return;
                }
                enumValueDescriptorArr[i10].setProto(j1Var.getValue(i10));
                i10++;
            }
        }

        public EnumValueDescriptor findValueByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof EnumValueDescriptor) {
                return (EnumValueDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public EnumValueDescriptor findValueByNumberCreatingIfUnknown(int i10) {
            EnumValueDescriptor enumValueDescriptorFindValueByNumber = findValueByNumber(i10);
            if (enumValueDescriptorFindValueByNumber != null) {
                return enumValueDescriptorFindValueByNumber;
            }
            synchronized (this) {
                try {
                    Integer num = new Integer(i10);
                    WeakReference<EnumValueDescriptor> weakReference = this.unknownValues.get(num);
                    if (weakReference != null) {
                        enumValueDescriptorFindValueByNumber = weakReference.get();
                    }
                    if (enumValueDescriptorFindValueByNumber == null) {
                        enumValueDescriptorFindValueByNumber = new EnumValueDescriptor(this.file, this, num, (AnonymousClass1) null);
                        this.unknownValues.put(num, new WeakReference<>(enumValueDescriptorFindValueByNumber));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return enumValueDescriptorFindValueByNumber;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public n1 getOptions() {
            return this.proto.getOptions();
        }

        public int getUnknownEnumValueDescriptorCount() {
            return this.unknownValues.size();
        }

        public List<EnumValueDescriptor> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.values));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private EnumDescriptor(j1 j1Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10) throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.unknownValues = new WeakHashMap<>();
            this.index = i10;
            this.proto = j1Var;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, j1Var.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (j1Var.getValueCount() == 0) {
                throw new DescriptorValidationException(this, "Enums must contain at least one value.", anonymousClass1);
            }
            this.values = new EnumValueDescriptor[j1Var.getValueCount()];
            for (int i11 = 0; i11 < j1Var.getValueCount(); i11++) {
                this.values[i11] = new EnumValueDescriptor(j1Var.getValue(i11), fileDescriptor, this, i11, null);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        @Override // com.explorestack.protobuf.p7
        public EnumValueDescriptor findValueByNumber(int i10) {
            return (EnumValueDescriptor) this.file.pool.enumValuesByNumber.get(new DescriptorPool.DescriptorIntPair(this, i10));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public j1 toProto() {
            return this.proto;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EnumValueDescriptor extends GenericDescriptor implements o7 {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private r1 proto;
        private final EnumDescriptor type;

        public /* synthetic */ EnumValueDescriptor(r1 r1Var, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i10, AnonymousClass1 anonymousClass1) throws DescriptorValidationException {
            this(r1Var, fileDescriptor, enumDescriptor, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(r1 r1Var) {
            this.proto = r1Var;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.explorestack.protobuf.o7
        public int getNumber() {
            return this.proto.getNumber();
        }

        public v1 getOptions() {
            return this.proto.getOptions();
        }

        public EnumDescriptor getType() {
            return this.type;
        }

        public String toString() {
            return this.proto.getName();
        }

        public /* synthetic */ EnumValueDescriptor(FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, Integer num, AnonymousClass1 anonymousClass1) {
            this(fileDescriptor, enumDescriptor, num);
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public r1 toProto() {
            return this.proto;
        }

        private EnumValueDescriptor(r1 r1Var, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i10) throws DescriptorValidationException {
            super(null);
            this.index = i10;
            this.proto = r1Var;
            this.file = fileDescriptor;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + r1Var.getName();
            fileDescriptor.pool.addSymbol(this);
            fileDescriptor.pool.addEnumValueByNumber(this);
        }

        private EnumValueDescriptor(FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, Integer num) {
            super(null);
            r1 r1VarBuild = r1.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + enumDescriptor.getName() + "_" + num).setNumber(num.intValue()).build();
            this.index = -1;
            this.proto = r1VarBuild;
            this.file = fileDescriptor;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + r1VarBuild.getName();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FieldDescriptor extends GenericDescriptor implements Comparable<FieldDescriptor>, a6 {
        private static final bd[] table = bd.values();
        private OneofDescriptor containingOneof;
        private Descriptor containingType;
        private Object defaultValue;
        private EnumDescriptor enumType;
        private final Descriptor extensionScope;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final boolean isProto3Optional;
        private final String jsonName;
        private Descriptor messageType;
        private f2 proto;
        private Type type;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum JavaType {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);

            private final Object defaultDefault;

            JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Type {
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type BOOL;
            public static final Type BYTES;
            public static final Type DOUBLE;
            public static final Type ENUM;
            public static final Type FIXED32;
            public static final Type FIXED64;
            public static final Type FLOAT;
            public static final Type GROUP;
            public static final Type INT32;
            public static final Type INT64;
            public static final Type MESSAGE;
            public static final Type SFIXED32;
            public static final Type SFIXED64;
            public static final Type SINT32;
            public static final Type SINT64;
            public static final Type STRING;
            public static final Type UINT32;
            public static final Type UINT64;
            private JavaType javaType;

            static {
                Type type = new Type("DOUBLE", 0, JavaType.DOUBLE);
                DOUBLE = type;
                Type type2 = new Type("FLOAT", 1, JavaType.FLOAT);
                FLOAT = type2;
                JavaType javaType = JavaType.LONG;
                Type type3 = new Type("INT64", 2, javaType);
                INT64 = type3;
                Type type4 = new Type("UINT64", 3, javaType);
                UINT64 = type4;
                JavaType javaType2 = JavaType.INT;
                Type type5 = new Type("INT32", 4, javaType2);
                INT32 = type5;
                Type type6 = new Type("FIXED64", 5, javaType);
                FIXED64 = type6;
                Type type7 = new Type("FIXED32", 6, javaType2);
                FIXED32 = type7;
                Type type8 = new Type("BOOL", 7, JavaType.BOOLEAN);
                BOOL = type8;
                Type type9 = new Type("STRING", 8, JavaType.STRING);
                STRING = type9;
                JavaType javaType3 = JavaType.MESSAGE;
                Type type10 = new Type("GROUP", 9, javaType3);
                GROUP = type10;
                Type type11 = new Type("MESSAGE", 10, javaType3);
                MESSAGE = type11;
                Type type12 = new Type("BYTES", 11, JavaType.BYTE_STRING);
                BYTES = type12;
                Type type13 = new Type("UINT32", 12, javaType2);
                UINT32 = type13;
                Type type14 = new Type("ENUM", 13, JavaType.ENUM);
                ENUM = type14;
                Type type15 = new Type("SFIXED32", 14, javaType2);
                SFIXED32 = type15;
                Type type16 = new Type("SFIXED64", 15, javaType);
                SFIXED64 = type16;
                Type type17 = new Type("SINT32", 16, javaType2);
                SINT32 = type17;
                Type type18 = new Type("SINT64", 17, javaType);
                SINT64 = type18;
                $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18};
            }

            private Type(String str, int i10, JavaType javaType) {
                this.javaType = javaType;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public JavaType getJavaType() {
                return this.javaType;
            }

            public DescriptorProtos$FieldDescriptorProto$Type toProto() {
                return DescriptorProtos$FieldDescriptorProto$Type.forNumber(ordinal() + 1);
            }

            public static Type valueOf(DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type) {
                return values()[descriptorProtos$FieldDescriptorProto$Type.getNumber() - 1];
            }
        }

        static {
            if (Type.values().length != DescriptorProtos$FieldDescriptorProto$Type.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        public /* synthetic */ FieldDescriptor(f2 f2Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10, boolean z10, AnonymousClass1 anonymousClass1) throws DescriptorValidationException {
            this(f2Var, fileDescriptor, descriptor, i10, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void crossLink() throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            if (this.proto.hasExtendee()) {
                GenericDescriptor genericDescriptorLookupSymbol = this.file.pool.lookupSymbol(this.proto.getExtendee(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!(genericDescriptorLookupSymbol instanceof Descriptor)) {
                    throw new DescriptorValidationException(this, "\"" + this.proto.getExtendee() + "\" is not a message type.", anonymousClass1);
                }
                this.containingType = (Descriptor) genericDescriptorLookupSymbol;
                if (!getContainingType().isExtensionNumber(getNumber())) {
                    throw new DescriptorValidationException(this, "\"" + getContainingType().getFullName() + "\" does not declare " + getNumber() + " as an extension number.", anonymousClass1);
                }
            }
            if (this.proto.hasTypeName()) {
                GenericDescriptor genericDescriptorLookupSymbol2 = this.file.pool.lookupSymbol(this.proto.getTypeName(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!this.proto.hasType()) {
                    if (genericDescriptorLookupSymbol2 instanceof Descriptor) {
                        this.type = Type.MESSAGE;
                    } else {
                        if (!(genericDescriptorLookupSymbol2 instanceof EnumDescriptor)) {
                            throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not a type.", anonymousClass1);
                        }
                        this.type = Type.ENUM;
                    }
                }
                if (getJavaType() == JavaType.MESSAGE) {
                    if (!(genericDescriptorLookupSymbol2 instanceof Descriptor)) {
                        throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not a message type.", anonymousClass1);
                    }
                    this.messageType = (Descriptor) genericDescriptorLookupSymbol2;
                    if (this.proto.hasDefaultValue()) {
                        throw new DescriptorValidationException(this, "Messages can't have default values.", anonymousClass1);
                    }
                } else {
                    if (getJavaType() != JavaType.ENUM) {
                        throw new DescriptorValidationException(this, "Field with primitive type has type_name.", anonymousClass1);
                    }
                    if (!(genericDescriptorLookupSymbol2 instanceof EnumDescriptor)) {
                        throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not an enum type.", anonymousClass1);
                    }
                    this.enumType = (EnumDescriptor) genericDescriptorLookupSymbol2;
                }
            } else if (getJavaType() == JavaType.MESSAGE || getJavaType() == JavaType.ENUM) {
                throw new DescriptorValidationException(this, "Field with message or enum type missing type_name.", anonymousClass1);
            }
            if (this.proto.getOptions().getPacked() && !isPackable()) {
                throw new DescriptorValidationException(this, "[packed = true] can only be specified for repeated primitive fields.", anonymousClass1);
            }
            if (this.proto.hasDefaultValue()) {
                if (isRepeated()) {
                    throw new DescriptorValidationException(this, "Repeated fields cannot have default values.", anonymousClass1);
                }
                try {
                    switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[getType().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            this.defaultValue = Integer.valueOf(TextFormat.parseInt32(this.proto.getDefaultValue()));
                            break;
                        case 4:
                        case 5:
                            this.defaultValue = Integer.valueOf(TextFormat.parseUInt32(this.proto.getDefaultValue()));
                            break;
                        case 6:
                        case 7:
                        case 8:
                            this.defaultValue = Long.valueOf(TextFormat.parseInt64(this.proto.getDefaultValue()));
                            break;
                        case 9:
                        case 10:
                            this.defaultValue = Long.valueOf(TextFormat.parseUInt64(this.proto.getDefaultValue()));
                            break;
                        case 11:
                            if (!this.proto.getDefaultValue().equals("inf")) {
                                if (!this.proto.getDefaultValue().equals("-inf")) {
                                    if (!this.proto.getDefaultValue().equals("nan")) {
                                        this.defaultValue = Float.valueOf(this.proto.getDefaultValue());
                                        break;
                                    } else {
                                        this.defaultValue = Float.valueOf(Float.NaN);
                                        break;
                                    }
                                } else {
                                    this.defaultValue = Float.valueOf(Float.NEGATIVE_INFINITY);
                                    break;
                                }
                            } else {
                                this.defaultValue = Float.valueOf(Float.POSITIVE_INFINITY);
                                break;
                            }
                        case 12:
                            if (!this.proto.getDefaultValue().equals("inf")) {
                                if (!this.proto.getDefaultValue().equals("-inf")) {
                                    if (!this.proto.getDefaultValue().equals("nan")) {
                                        this.defaultValue = Double.valueOf(this.proto.getDefaultValue());
                                        break;
                                    } else {
                                        this.defaultValue = Double.valueOf(Double.NaN);
                                        break;
                                    }
                                } else {
                                    this.defaultValue = Double.valueOf(Double.NEGATIVE_INFINITY);
                                    break;
                                }
                            } else {
                                this.defaultValue = Double.valueOf(Double.POSITIVE_INFINITY);
                                break;
                            }
                        case 13:
                            this.defaultValue = Boolean.valueOf(this.proto.getDefaultValue());
                            break;
                        case 14:
                            this.defaultValue = this.proto.getDefaultValue();
                            break;
                        case 15:
                            try {
                                this.defaultValue = TextFormat.unescapeBytes(this.proto.getDefaultValue());
                                break;
                            } catch (TextFormat.InvalidEscapeSequenceException e10) {
                                throw new DescriptorValidationException(this, "Couldn't parse default value: " + e10.getMessage(), e10, anonymousClass1);
                            }
                        case 16:
                            EnumValueDescriptor enumValueDescriptorFindValueByName = this.enumType.findValueByName(this.proto.getDefaultValue());
                            this.defaultValue = enumValueDescriptorFindValueByName;
                            if (enumValueDescriptorFindValueByName == null) {
                                throw new DescriptorValidationException(this, "Unknown enum default value: \"" + this.proto.getDefaultValue() + AbstractJsonLexerKt.STRING, anonymousClass1);
                            }
                            break;
                        case 17:
                        case 18:
                            throw new DescriptorValidationException(this, "Message type had default value.", anonymousClass1);
                    }
                } catch (NumberFormatException e11) {
                    throw new DescriptorValidationException(this, "Could not parse default value: \"" + this.proto.getDefaultValue() + AbstractJsonLexerKt.STRING, e11, anonymousClass1);
                }
            } else if (isRepeated()) {
                this.defaultValue = Collections.EMPTY_LIST;
            } else {
                int i10 = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[getJavaType().ordinal()];
                if (i10 == 1) {
                    this.defaultValue = this.enumType.getValues().get(0);
                } else if (i10 != 2) {
                    this.defaultValue = getJavaType().defaultDefault;
                } else {
                    this.defaultValue = null;
                }
            }
            if (!isExtension()) {
                this.file.pool.addFieldByNumber(this);
            }
            Descriptor descriptor = this.containingType;
            if (descriptor == null || !descriptor.getOptions().getMessageSetWireFormat()) {
                return;
            }
            if (!isExtension()) {
                throw new DescriptorValidationException(this, "MessageSets cannot have fields, only extensions.", anonymousClass1);
            }
            if (!isOptional() || getType() != Type.MESSAGE) {
                throw new DescriptorValidationException(this, "Extensions of MessageSets must be optional messages.", anonymousClass1);
            }
        }

        private static String fieldNameToJsonName(String str) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length);
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '_') {
                    z10 = true;
                } else if (z10) {
                    if ('a' <= cCharAt && cCharAt <= 'z') {
                        cCharAt = (char) (cCharAt - ' ');
                    }
                    sb2.append(cCharAt);
                    z10 = false;
                } else {
                    sb2.append(cCharAt);
                }
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(f2 f2Var) {
            this.proto = f2Var;
        }

        public OneofDescriptor getContainingOneof() {
            return this.containingOneof;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public Object getDefaultValue() {
            if (getJavaType() != JavaType.MESSAGE) {
                return this.defaultValue;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public Descriptor getExtensionScope() {
            if (isExtension()) {
                return this.extensionScope;
            }
            throw new UnsupportedOperationException(a.b.l("This field is not an extension. (", this.fullName, ")"));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public JavaType getJavaType() {
            return this.type.getJavaType();
        }

        public String getJsonName() {
            return this.jsonName;
        }

        @Override // com.explorestack.protobuf.a6
        public cd getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        @Override // com.explorestack.protobuf.a6
        public bd getLiteType() {
            return table[this.type.ordinal()];
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.explorestack.protobuf.a6
        public int getNumber() {
            return this.proto.getNumber();
        }

        public l2 getOptions() {
            return this.proto.getOptions();
        }

        public OneofDescriptor getRealContainingOneof() {
            OneofDescriptor oneofDescriptor = this.containingOneof;
            if (oneofDescriptor == null || oneofDescriptor.isSynthetic()) {
                return null;
            }
            return this.containingOneof;
        }

        public Type getType() {
            return this.type;
        }

        public boolean hasDefaultValue() {
            return this.proto.hasDefaultValue();
        }

        public boolean hasOptionalKeyword() {
            if (this.isProto3Optional) {
                return true;
            }
            return this.file.getSyntax() == FileDescriptor.Syntax.PROTO2 && isOptional() && getContainingOneof() == null;
        }

        public boolean hasPresence() {
            if (isRepeated()) {
                return false;
            }
            return getType() == Type.MESSAGE || getType() == Type.GROUP || getContainingOneof() != null || this.file.getSyntax() == FileDescriptor.Syntax.PROTO2;
        }

        @Override // com.explorestack.protobuf.a6
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Message.Builder) builder).mergeFrom((Message) messageLite);
        }

        public boolean isExtension() {
            return this.proto.hasExtendee();
        }

        public boolean isMapField() {
            return getType() == Type.MESSAGE && isRepeated() && getMessageType().getOptions().getMapEntry();
        }

        public boolean isOptional() {
            return this.proto.getLabel() == DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL;
        }

        public boolean isPackable() {
            return isRepeated() && getLiteType().isPackable();
        }

        @Override // com.explorestack.protobuf.a6
        public boolean isPacked() {
            if (isPackable()) {
                return getFile().getSyntax() == FileDescriptor.Syntax.PROTO2 ? getOptions().getPacked() : !getOptions().hasPacked() || getOptions().getPacked();
            }
            return false;
        }

        @Override // com.explorestack.protobuf.a6
        public boolean isRepeated() {
            return this.proto.getLabel() == DescriptorProtos$FieldDescriptorProto$Label.LABEL_REPEATED;
        }

        public boolean isRequired() {
            return this.proto.getLabel() == DescriptorProtos$FieldDescriptorProto$Label.LABEL_REQUIRED;
        }

        public boolean needsUtf8Check() {
            if (this.type != Type.STRING) {
                return false;
            }
            if (getContainingType().getOptions().getMapEntry() || getFile().getSyntax() == FileDescriptor.Syntax.PROTO3) {
                return true;
            }
            return getFile().getOptions().getJavaStringCheckUtf8();
        }

        public String toString() {
            return getFullName();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FieldDescriptor(f2 f2Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10, boolean z10) throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.index = i10;
            this.proto = f2Var;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, f2Var.getName());
            this.file = fileDescriptor;
            if (f2Var.hasJsonName()) {
                this.jsonName = f2Var.getJsonName();
            } else {
                this.jsonName = fieldNameToJsonName(f2Var.getName());
            }
            if (f2Var.hasType()) {
                this.type = Type.valueOf(f2Var.getType());
            }
            this.isProto3Optional = f2Var.getProto3Optional();
            if (getNumber() <= 0) {
                throw new DescriptorValidationException(this, "Field numbers must be positive integers.", anonymousClass1);
            }
            if (z10) {
                if (!f2Var.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.", anonymousClass1);
                }
                this.containingType = null;
                if (descriptor != null) {
                    this.extensionScope = descriptor;
                } else {
                    this.extensionScope = null;
                }
                if (f2Var.hasOneofIndex()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.", anonymousClass1);
                }
                this.containingOneof = null;
            } else {
                if (f2Var.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.", anonymousClass1);
                }
                this.containingType = descriptor;
                if (!f2Var.hasOneofIndex()) {
                    this.containingOneof = null;
                } else {
                    if (f2Var.getOneofIndex() < 0 || f2Var.getOneofIndex() >= descriptor.toProto().getOneofDeclCount()) {
                        throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + descriptor.getName(), anonymousClass1);
                    }
                    OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(f2Var.getOneofIndex());
                    this.containingOneof = oneofDescriptor;
                    OneofDescriptor.access$2008(oneofDescriptor);
                }
                this.extensionScope = null;
            }
            fileDescriptor.pool.addSymbol(this);
        }

        @Override // java.lang.Comparable
        public int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.containingType == this.containingType) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        @Override // com.explorestack.protobuf.a6
        public EnumDescriptor getEnumType() {
            if (getJavaType() == JavaType.ENUM) {
                return this.enumType;
            }
            throw new UnsupportedOperationException(a.b.l("This field is not of enum type. (", this.fullName, ")"));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public f2 toProto() {
            return this.proto;
        }

        public Descriptor getMessageType() {
            if (getJavaType() == JavaType.MESSAGE) {
                return this.messageType;
            }
            throw new UnsupportedOperationException(a.b.l(YsiBvdpw.lHAmCGeOi, this.fullName, ")"));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FileDescriptor extends GenericDescriptor {
        private final FileDescriptor[] dependencies;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final Descriptor[] messageTypes;
        private final DescriptorPool pool;
        private p2 proto;
        private final FileDescriptor[] publicDependencies;
        private final ServiceDescriptor[] services;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Deprecated
        public interface InternalDescriptorAssigner {
            i5 assignDescriptors(FileDescriptor fileDescriptor);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum Syntax {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3");

            private final String name;

            Syntax(String str) {
                this.name = str;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FileDescriptor(p2 p2Var, FileDescriptor[] fileDescriptorArr, DescriptorPool descriptorPool, boolean z10) throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.pool = descriptorPool;
            this.proto = p2Var;
            this.dependencies = (FileDescriptor[]) fileDescriptorArr.clone();
            HashMap map = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                map.put(fileDescriptor.getName(), fileDescriptor);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < p2Var.getPublicDependencyCount(); i10++) {
                int publicDependency = p2Var.getPublicDependency(i10);
                if (publicDependency < 0 || publicDependency >= p2Var.getDependencyCount()) {
                    throw new DescriptorValidationException(this, "Invalid public dependency index.", anonymousClass1);
                }
                String dependency = p2Var.getDependency(publicDependency);
                FileDescriptor fileDescriptor2 = (FileDescriptor) map.get(dependency);
                if (fileDescriptor2 != null) {
                    arrayList.add(fileDescriptor2);
                } else if (!z10) {
                    throw new DescriptorValidationException(this, a.b.k("Invalid public dependency: ", dependency), anonymousClass1);
                }
            }
            FileDescriptor[] fileDescriptorArr2 = new FileDescriptor[arrayList.size()];
            this.publicDependencies = fileDescriptorArr2;
            arrayList.toArray(fileDescriptorArr2);
            descriptorPool.addPackage(getPackage(), this);
            this.messageTypes = new Descriptor[p2Var.getMessageTypeCount()];
            for (int i11 = 0; i11 < p2Var.getMessageTypeCount(); i11++) {
                this.messageTypes[i11] = new Descriptor(p2Var.getMessageType(i11), this, null, i11, null);
            }
            this.enumTypes = new EnumDescriptor[p2Var.getEnumTypeCount()];
            for (int i12 = 0; i12 < p2Var.getEnumTypeCount(); i12++) {
                this.enumTypes[i12] = new EnumDescriptor(p2Var.getEnumType(i12), this, null, i12, null);
            }
            this.services = new ServiceDescriptor[p2Var.getServiceCount()];
            for (int i13 = 0; i13 < p2Var.getServiceCount(); i13++) {
                this.services[i13] = new ServiceDescriptor(p2Var.getService(i13), this, i13, anonymousClass1);
            }
            this.extensions = new FieldDescriptor[p2Var.getExtensionCount()];
            for (int i14 = 0; i14 < p2Var.getExtensionCount(); i14++) {
                this.extensions[i14] = new FieldDescriptor(p2Var.getExtension(i14), this, null, i14, true, null);
            }
        }

        public static FileDescriptor buildFrom(p2 p2Var, FileDescriptor[] fileDescriptorArr) throws DescriptorValidationException {
            return buildFrom(p2Var, fileDescriptorArr, false);
        }

        private void crossLink() throws DescriptorValidationException {
            for (Descriptor descriptor : this.messageTypes) {
                descriptor.crossLink();
            }
            for (ServiceDescriptor serviceDescriptor : this.services) {
                serviceDescriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.extensions) {
                fieldDescriptor.crossLink();
            }
        }

        private static FileDescriptor[] findDescriptors(Class<?> cls, String[] strArr, String[] strArr2) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    arrayList.add((FileDescriptor) cls.getClassLoader().loadClass(strArr[i10]).getField("descriptor").get(null));
                } catch (Exception unused) {
                    Descriptors.logger.warning("Descriptors for \"" + strArr2[i10] + "\" can not be found.");
                }
            }
            return (FileDescriptor[]) arrayList.toArray(new FileDescriptor[0]);
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr, InternalDescriptorAssigner internalDescriptorAssigner) {
            byte[] bArrLatin1Cat = latin1Cat(strArr);
            try {
                p2 from = p2.parseFrom(bArrLatin1Cat);
                try {
                    FileDescriptor fileDescriptorBuildFrom = buildFrom(from, fileDescriptorArr, true);
                    i5 i5VarAssignDescriptors = internalDescriptorAssigner.assignDescriptors(fileDescriptorBuildFrom);
                    if (i5VarAssignDescriptors != null) {
                        try {
                            fileDescriptorBuildFrom.setProto(p2.parseFrom(bArrLatin1Cat, i5VarAssignDescriptors));
                        } catch (InvalidProtocolBufferException e10) {
                            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e10);
                        }
                    }
                } catch (DescriptorValidationException e11) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e11);
                }
            } catch (InvalidProtocolBufferException e12) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e12);
            }
        }

        public static void internalUpdateFileDescriptor(FileDescriptor fileDescriptor, i5 i5Var) {
            try {
                fileDescriptor.setProto(p2.parseFrom(fileDescriptor.proto.toByteString(), i5Var));
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e10);
            }
        }

        private static byte[] latin1Cat(String[] strArr) {
            if (strArr.length == 1) {
                return strArr[0].getBytes(x7.f22882b);
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                sb2.append(str);
            }
            return sb2.toString().getBytes(x7.f22882b);
        }

        private void setProto(p2 p2Var) {
            this.proto = p2Var;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                Descriptor[] descriptorArr = this.messageTypes;
                if (i11 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i11].setProto(p2Var.getMessageType(i11));
                i11++;
            }
            int i12 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i12 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i12].setProto(p2Var.getEnumType(i12));
                i12++;
            }
            int i13 = 0;
            while (true) {
                ServiceDescriptor[] serviceDescriptorArr = this.services;
                if (i13 >= serviceDescriptorArr.length) {
                    break;
                }
                serviceDescriptorArr[i13].setProto(p2Var.getService(i13));
                i13++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.extensions;
                if (i10 >= fieldDescriptorArr.length) {
                    return;
                }
                fieldDescriptorArr[i10].setProto(p2Var.getExtension(i10));
                i10++;
            }
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof EnumDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (EnumDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof FieldDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (FieldDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public Descriptor findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof Descriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (Descriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public ServiceDescriptor findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof ServiceDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (ServiceDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public List<FileDescriptor> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.dependencies));
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.proto.getName();
        }

        public List<Descriptor> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.messageTypes));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public u2 getOptions() {
            return this.proto.getOptions();
        }

        public String getPackage() {
            return this.proto.getPackage();
        }

        public List<FileDescriptor> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.publicDependencies));
        }

        public List<ServiceDescriptor> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.services));
        }

        public Syntax getSyntax() {
            Syntax syntax = Syntax.PROTO3;
            return syntax.name.equals(this.proto.getSyntax()) ? syntax : Syntax.PROTO2;
        }

        public boolean supportsUnknownEnumValue() {
            return getSyntax() == Syntax.PROTO3;
        }

        public static FileDescriptor buildFrom(p2 p2Var, FileDescriptor[] fileDescriptorArr, boolean z10) throws DescriptorValidationException {
            FileDescriptor fileDescriptor = new FileDescriptor(p2Var, fileDescriptorArr, new DescriptorPool(fileDescriptorArr, z10), z10);
            fileDescriptor.crossLink();
            return fileDescriptor;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public p2 toProto() {
            return this.proto;
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr) {
            try {
                p2 from = p2.parseFrom(latin1Cat(strArr));
                try {
                    return buildFrom(from, fileDescriptorArr, true);
                } catch (DescriptorValidationException e10) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e10);
                }
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e11);
            }
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3, InternalDescriptorAssigner internalDescriptorAssigner) {
            internalBuildGeneratedFileFrom(strArr, findDescriptors(cls, strArr2, strArr3), internalDescriptorAssigner);
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3) {
            return internalBuildGeneratedFileFrom(strArr, findDescriptors(cls, strArr2, strArr3));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this;
        }

        public FileDescriptor(String str, Descriptor descriptor) throws DescriptorValidationException {
            super(null);
            DescriptorPool descriptorPool = new DescriptorPool(new FileDescriptor[0], true);
            this.pool = descriptorPool;
            this.proto = p2.newBuilder().setName(descriptor.getFullName() + ".placeholder.proto").setPackage(str).addMessageType(descriptor.toProto()).build();
            this.dependencies = new FileDescriptor[0];
            this.publicDependencies = new FileDescriptor[0];
            this.messageTypes = new Descriptor[]{descriptor};
            this.enumTypes = new EnumDescriptor[0];
            this.services = new ServiceDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            descriptorPool.addPackage(str, this);
            descriptorPool.addSymbol(descriptor);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class GenericDescriptor {
        public /* synthetic */ GenericDescriptor(AnonymousClass1 anonymousClass1) {
            this();
        }

        public abstract FileDescriptor getFile();

        public abstract String getFullName();

        public abstract String getName();

        public abstract Message toProto();

        private GenericDescriptor() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MethodDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor inputType;
        private Descriptor outputType;
        private k3 proto;
        private final ServiceDescriptor service;

        public /* synthetic */ MethodDescriptor(k3 k3Var, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i10, AnonymousClass1 anonymousClass1) throws DescriptorValidationException {
            this(k3Var, fileDescriptor, serviceDescriptor, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            DescriptorPool descriptorPool = this.file.pool;
            String inputType = this.proto.getInputType();
            DescriptorPool.SearchFilter searchFilter = DescriptorPool.SearchFilter.TYPES_ONLY;
            GenericDescriptor genericDescriptorLookupSymbol = descriptorPool.lookupSymbol(inputType, this, searchFilter);
            AnonymousClass1 anonymousClass1 = null;
            if (!(genericDescriptorLookupSymbol instanceof Descriptor)) {
                throw new DescriptorValidationException(this, "\"" + this.proto.getInputType() + "\" is not a message type.", anonymousClass1);
            }
            this.inputType = (Descriptor) genericDescriptorLookupSymbol;
            GenericDescriptor genericDescriptorLookupSymbol2 = this.file.pool.lookupSymbol(this.proto.getOutputType(), this, searchFilter);
            if (genericDescriptorLookupSymbol2 instanceof Descriptor) {
                this.outputType = (Descriptor) genericDescriptorLookupSymbol2;
                return;
            }
            throw new DescriptorValidationException(this, "\"" + this.proto.getOutputType() + "\" is not a message type.", anonymousClass1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(k3 k3Var) {
            this.proto = k3Var;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public Descriptor getInputType() {
            return this.inputType;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public p3 getOptions() {
            return this.proto.getOptions();
        }

        public Descriptor getOutputType() {
            return this.outputType;
        }

        public ServiceDescriptor getService() {
            return this.service;
        }

        public boolean isClientStreaming() {
            return this.proto.getClientStreaming();
        }

        public boolean isServerStreaming() {
            return this.proto.getServerStreaming();
        }

        private MethodDescriptor(k3 k3Var, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i10) throws DescriptorValidationException {
            super(null);
            this.index = i10;
            this.proto = k3Var;
            this.file = fileDescriptor;
            this.service = serviceDescriptor;
            this.fullName = serviceDescriptor.getFullName() + '.' + k3Var.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public k3 toProto() {
            return this.proto;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OneofDescriptor extends GenericDescriptor {
        private Descriptor containingType;
        private int fieldCount;
        private FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private t3 proto;

        public /* synthetic */ OneofDescriptor(t3 t3Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10, AnonymousClass1 anonymousClass1) throws DescriptorValidationException {
            this(t3Var, fileDescriptor, descriptor, i10);
        }

        public static /* synthetic */ int access$2008(OneofDescriptor oneofDescriptor) {
            int i10 = oneofDescriptor.fieldCount;
            oneofDescriptor.fieldCount = i10 + 1;
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(t3 t3Var) {
            this.proto = t3Var;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public FieldDescriptor getField(int i10) {
            return this.fields[i10];
        }

        public int getFieldCount() {
            return this.fieldCount;
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public x3 getOptions() {
            return this.proto.getOptions();
        }

        public boolean isSynthetic() {
            FieldDescriptor[] fieldDescriptorArr = this.fields;
            return fieldDescriptorArr.length == 1 && fieldDescriptorArr[0].isProto3Optional;
        }

        private OneofDescriptor(t3 t3Var, FileDescriptor fileDescriptor, Descriptor descriptor, int i10) throws DescriptorValidationException {
            super(null);
            this.proto = t3Var;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, t3Var.getName());
            this.file = fileDescriptor;
            this.index = i10;
            this.containingType = descriptor;
            this.fieldCount = 0;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public t3 toProto() {
            return this.proto;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ServiceDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private MethodDescriptor[] methods;
        private b4 proto;

        public /* synthetic */ ServiceDescriptor(b4 b4Var, FileDescriptor fileDescriptor, int i10, AnonymousClass1 anonymousClass1) throws DescriptorValidationException {
            this(b4Var, fileDescriptor, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            for (MethodDescriptor methodDescriptor : this.methods) {
                methodDescriptor.crossLink();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(b4 b4Var) {
            this.proto = b4Var;
            int i10 = 0;
            while (true) {
                MethodDescriptor[] methodDescriptorArr = this.methods;
                if (i10 >= methodDescriptorArr.length) {
                    return;
                }
                methodDescriptorArr[i10].setProto(b4Var.getMethod(i10));
                i10++;
            }
        }

        public MethodDescriptor findMethodByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof MethodDescriptor) {
                return (MethodDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public List<MethodDescriptor> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.methods));
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public f4 getOptions() {
            return this.proto.getOptions();
        }

        private ServiceDescriptor(b4 b4Var, FileDescriptor fileDescriptor, int i10) throws DescriptorValidationException {
            super(null);
            this.index = i10;
            this.proto = b4Var;
            this.fullName = Descriptors.computeFullName(fileDescriptor, null, b4Var.getName());
            this.file = fileDescriptor;
            this.methods = new MethodDescriptor[b4Var.getMethodCount()];
            for (int i11 = 0; i11 < b4Var.getMethodCount(); i11++) {
                this.methods[i11] = new MethodDescriptor(b4Var.getMethod(i11), fileDescriptor, this, i11, null);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        @Override // com.explorestack.protobuf.Descriptors.GenericDescriptor
        public b4 toProto() {
            return this.proto;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String computeFullName(FileDescriptor fileDescriptor, Descriptor descriptor, String str) {
        if (descriptor != null) {
            return descriptor.getFullName() + '.' + str;
        }
        String str2 = fileDescriptor.getPackage();
        if (str2.isEmpty()) {
            return str;
        }
        return str2 + '.' + str;
    }
}
