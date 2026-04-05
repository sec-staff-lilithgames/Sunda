package ki;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f71252a = Charset.forName(C.UTF8_NAME);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: ki.f2$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0714a {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: ki.f2$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0715a {
                public abstract AbstractC0714a build();

                public abstract AbstractC0715a setArch(String str);

                public abstract AbstractC0715a setBuildId(String str);

                public abstract AbstractC0715a setLibraryName(String str);
            }

            public static AbstractC0715a builder() {
                return new f0();
            }

            public abstract String getArch();

            public abstract String getBuildId();

            public abstract String getLibraryName();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class b {
            public abstract a build();

            public abstract b setBuildIdMappingForArch(List<AbstractC0714a> list);

            public abstract b setImportance(int i10);

            public abstract b setPid(int i10);

            public abstract b setProcessName(String str);

            public abstract b setPss(long j10);

            public abstract b setReasonCode(int i10);

            public abstract b setRss(long j10);

            public abstract b setTimestamp(long j10);

            public abstract b setTraceFile(String str);
        }

        public static b builder() {
            return new d0();
        }

        public abstract List<AbstractC0714a> getBuildIdMappingForArch();

        public abstract int getImportance();

        public abstract int getPid();

        public abstract String getProcessName();

        public abstract long getPss();

        public abstract int getReasonCode();

        public abstract long getRss();

        public abstract long getTimestamp();

        public abstract String getTraceFile();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public abstract f2 build();

        public abstract b setAppExitInfo(a aVar);

        public abstract b setAppQualitySessionId(String str);

        public abstract b setBuildVersion(String str);

        public abstract b setDisplayVersion(String str);

        public abstract b setFirebaseAuthenticationToken(String str);

        public abstract b setFirebaseInstallationId(String str);

        public abstract b setGmpAppId(String str);

        public abstract b setInstallationUuid(String str);

        public abstract b setNdkPayload(d dVar);

        public abstract b setPlatform(int i10);

        public abstract b setSdkVersion(String str);

        public abstract b setSession(e eVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class a {
            public abstract c build();

            public abstract a setKey(String str);

            public abstract a setValue(String str);
        }

        public static a builder() {
            return new h0();
        }

        public abstract String getKey();

        public abstract String getValue();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class d {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class a {
            public abstract d build();

            public abstract a setFiles(List<b> list);

            public abstract a setOrgId(String str);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class b {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class a {
                public abstract b build();

                public abstract a setContents(byte[] bArr);

                public abstract a setFilename(String str);
            }

            public static a builder() {
                return new l0();
            }

            public abstract byte[] getContents();

            public abstract String getFilename();
        }

        public static a builder() {
            return new j0();
        }

        public abstract j0 a();

        public abstract List<b> getFiles();

        public abstract String getOrgId();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class e {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class a {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: ki.f2$e$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0716a {
                public abstract a build();

                public abstract AbstractC0716a setDevelopmentPlatform(String str);

                public abstract AbstractC0716a setDevelopmentPlatformVersion(String str);

                public abstract AbstractC0716a setDisplayVersion(String str);

                public abstract AbstractC0716a setIdentifier(String str);

                public abstract AbstractC0716a setInstallationUuid(String str);

                public abstract AbstractC0716a setOrganization(b bVar);

                public abstract AbstractC0716a setVersion(String str);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class b {

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: ki.f2$e$a$b$a, reason: collision with other inner class name */
                public static abstract class AbstractC0717a {
                    public abstract b build();

                    public abstract AbstractC0717a setClsId(String str);
                }

                public static AbstractC0717a builder() {
                    return new r0();
                }

                public abstract r0 a();

                public abstract String getClsId();
            }

            public static AbstractC0716a builder() {
                return new p0();
            }

            public abstract p0 a();

            public abstract String getDevelopmentPlatform();

            public abstract String getDevelopmentPlatformVersion();

            public abstract String getDisplayVersion();

            public abstract String getIdentifier();

            public abstract String getInstallationUuid();

            public abstract b getOrganization();

            public abstract String getVersion();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class b {
            public abstract e build();

            public abstract b setApp(a aVar);

            public abstract b setAppQualitySessionId(String str);

            public abstract b setCrashed(boolean z10);

            public abstract b setDevice(c cVar);

            public abstract b setEndedAt(Long l9);

            public abstract b setEvents(List<d> list);

            public abstract b setGenerator(String str);

            public abstract b setGeneratorType(int i10);

            public abstract b setIdentifier(String str);

            public b setIdentifierFromUtf8Bytes(byte[] bArr) {
                return setIdentifier(new String(bArr, f2.f71252a));
            }

            public abstract b setOs(AbstractC0732e abstractC0732e);

            public abstract b setStartedAt(long j10);

            public abstract b setUser(f fVar);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class c {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class a {
                public abstract c build();

                public abstract a setArch(int i10);

                public abstract a setCores(int i10);

                public abstract a setDiskSpace(long j10);

                public abstract a setManufacturer(String str);

                public abstract a setModel(String str);

                public abstract a setModelClass(String str);

                public abstract a setRam(long j10);

                public abstract a setSimulator(boolean z10);

                public abstract a setState(int i10);
            }

            public static a builder() {
                return new t0();
            }

            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            public abstract String getManufacturer();

            public abstract String getModel();

            public abstract String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class d {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class a {

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: ki.f2$e$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC0718a {
                    public abstract a build();

                    public abstract AbstractC0718a setAppProcessDetails(List<c> list);

                    public abstract AbstractC0718a setBackground(Boolean bool);

                    public abstract AbstractC0718a setCurrentProcessDetails(c cVar);

                    public abstract AbstractC0718a setCustomAttributes(List<c> list);

                    public abstract AbstractC0718a setExecution(b bVar);

                    public abstract AbstractC0718a setInternalKeys(List<c> list);

                    public abstract AbstractC0718a setUiOrientation(int i10);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static abstract class b {

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: ki.f2$e$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0719a {

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        /* renamed from: ki.f2$e$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0720a {
                            public abstract AbstractC0719a build();

                            public abstract AbstractC0720a setBaseAddress(long j10);

                            public abstract AbstractC0720a setName(String str);

                            public abstract AbstractC0720a setSize(long j10);

                            public abstract AbstractC0720a setUuid(String str);

                            public AbstractC0720a setUuidFromUtf8Bytes(byte[] bArr) {
                                return setUuid(new String(bArr, f2.f71252a));
                            }
                        }

                        public static AbstractC0720a builder() {
                            return new b1();
                        }

                        public abstract long getBaseAddress();

                        public abstract String getName();

                        public abstract long getSize();

                        public abstract String getUuid();

                        public byte[] getUuidUtf8Bytes() {
                            String uuid = getUuid();
                            if (uuid != null) {
                                return uuid.getBytes(f2.f71252a);
                            }
                            return null;
                        }
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: ki.f2$e$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC0721b {
                        public abstract b build();

                        public abstract AbstractC0721b setAppExitInfo(a aVar);

                        public abstract AbstractC0721b setBinaries(List<AbstractC0719a> list);

                        public abstract AbstractC0721b setException(c cVar);

                        public abstract AbstractC0721b setSignal(AbstractC0723d abstractC0723d);

                        public abstract AbstractC0721b setThreads(List<AbstractC0725e> list);
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static abstract class c {

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        /* renamed from: ki.f2$e$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0722a {
                            public abstract c build();

                            public abstract AbstractC0722a setCausedBy(c cVar);

                            public abstract AbstractC0722a setFrames(List<AbstractC0725e.AbstractC0727b> list);

                            public abstract AbstractC0722a setOverflowCount(int i10);

                            public abstract AbstractC0722a setReason(String str);

                            public abstract AbstractC0722a setType(String str);
                        }

                        public static AbstractC0722a builder() {
                            return new d1();
                        }

                        public abstract c getCausedBy();

                        public abstract List<AbstractC0725e.AbstractC0727b> getFrames();

                        public abstract int getOverflowCount();

                        public abstract String getReason();

                        public abstract String getType();
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: ki.f2$e$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC0723d {

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        /* renamed from: ki.f2$e$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0724a {
                            public abstract AbstractC0723d build();

                            public abstract AbstractC0724a setAddress(long j10);

                            public abstract AbstractC0724a setCode(String str);

                            public abstract AbstractC0724a setName(String str);
                        }

                        public static AbstractC0724a builder() {
                            return new f1();
                        }

                        public abstract long getAddress();

                        public abstract String getCode();

                        public abstract String getName();
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: ki.f2$e$d$a$b$e, reason: collision with other inner class name */
                    public static abstract class AbstractC0725e {

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        /* renamed from: ki.f2$e$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC0726a {
                            public abstract AbstractC0725e build();

                            public abstract AbstractC0726a setFrames(List<AbstractC0727b> list);

                            public abstract AbstractC0726a setImportance(int i10);

                            public abstract AbstractC0726a setName(String str);
                        }

                        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                        /* renamed from: ki.f2$e$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC0727b {

                            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                            /* renamed from: ki.f2$e$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC0728a {
                                public abstract AbstractC0727b build();

                                public abstract AbstractC0728a setFile(String str);

                                public abstract AbstractC0728a setImportance(int i10);

                                public abstract AbstractC0728a setOffset(long j10);

                                public abstract AbstractC0728a setPc(long j10);

                                public abstract AbstractC0728a setSymbol(String str);
                            }

                            public static AbstractC0728a builder() {
                                return new j1();
                            }

                            public abstract String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            public abstract String getSymbol();
                        }

                        public static AbstractC0726a builder() {
                            return new h1();
                        }

                        public abstract List<AbstractC0727b> getFrames();

                        public abstract int getImportance();

                        public abstract String getName();
                    }

                    public static AbstractC0721b builder() {
                        return new z0();
                    }

                    public abstract a getAppExitInfo();

                    public abstract List<AbstractC0719a> getBinaries();

                    public abstract c getException();

                    public abstract AbstractC0723d getSignal();

                    public abstract List<AbstractC0725e> getThreads();
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static abstract class c {

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: ki.f2$e$d$a$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC0729a {
                        public abstract c build();

                        public abstract AbstractC0729a setDefaultProcess(boolean z10);

                        public abstract AbstractC0729a setImportance(int i10);

                        public abstract AbstractC0729a setPid(int i10);

                        public abstract AbstractC0729a setProcessName(String str);
                    }

                    public static AbstractC0729a builder() {
                        return new l1();
                    }

                    public abstract int getImportance();

                    public abstract int getPid();

                    public abstract String getProcessName();

                    public abstract boolean isDefaultProcess();
                }

                public static AbstractC0718a builder() {
                    return new x0();
                }

                public abstract List<c> getAppProcessDetails();

                public abstract Boolean getBackground();

                public abstract c getCurrentProcessDetails();

                public abstract List<c> getCustomAttributes();

                public abstract b getExecution();

                public abstract List<c> getInternalKeys();

                public abstract int getUiOrientation();

                public abstract AbstractC0718a toBuilder();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class b {
                public abstract d build();

                public abstract b setApp(a aVar);

                public abstract b setDevice(c cVar);

                public abstract b setLog(AbstractC0730d abstractC0730d);

                public abstract b setRollouts(f fVar);

                public abstract b setTimestamp(long j10);

                public abstract b setType(String str);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class c {

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static abstract class a {
                    public abstract c build();

                    public abstract a setBatteryLevel(Double d10);

                    public abstract a setBatteryVelocity(int i10);

                    public abstract a setDiskUsed(long j10);

                    public abstract a setOrientation(int i10);

                    public abstract a setProximityOn(boolean z10);

                    public abstract a setRamUsed(long j10);
                }

                public static a builder() {
                    return new n1();
                }

                public abstract Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: ki.f2$e$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC0730d {

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: ki.f2$e$d$d$a */
                public static abstract class a {
                    public abstract AbstractC0730d build();

                    public abstract a setContent(String str);
                }

                public static a builder() {
                    return new p1();
                }

                public abstract String getContent();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: ki.f2$e$d$e, reason: collision with other inner class name */
            public static abstract class AbstractC0731e {

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: ki.f2$e$d$e$a */
                public static abstract class a {
                    public abstract AbstractC0731e build();

                    public abstract a setParameterKey(String str);

                    public abstract a setParameterValue(String str);

                    public abstract a setRolloutVariant(b bVar);

                    public abstract a setTemplateVersion(long j10);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: ki.f2$e$d$e$b */
                public static abstract class b {

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    /* renamed from: ki.f2$e$d$e$b$a */
                    public static abstract class a {
                        public abstract b build();

                        public abstract a setRolloutId(String str);

                        public abstract a setVariantId(String str);
                    }

                    public static a builder() {
                        return new t1();
                    }

                    public abstract String getRolloutId();

                    public abstract String getVariantId();
                }

                public static a builder() {
                    return new r1();
                }

                public abstract String getParameterKey();

                public abstract String getParameterValue();

                public abstract b getRolloutVariant();

                public abstract long getTemplateVersion();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class f {

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static abstract class a {
                    public abstract f build();

                    public abstract a setRolloutAssignments(List<AbstractC0731e> list);
                }

                public static a builder() {
                    return new v1();
                }

                public abstract List<AbstractC0731e> getRolloutAssignments();
            }

            public static b builder() {
                return new v0();
            }

            public abstract a getApp();

            public abstract c getDevice();

            public abstract AbstractC0730d getLog();

            public abstract f getRollouts();

            public abstract long getTimestamp();

            public abstract String getType();

            public abstract b toBuilder();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: ki.f2$e$e, reason: collision with other inner class name */
        public static abstract class AbstractC0732e {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: ki.f2$e$e$a */
            public static abstract class a {
                public abstract AbstractC0732e build();

                public abstract a setBuildVersion(String str);

                public abstract a setJailbroken(boolean z10);

                public abstract a setPlatform(int i10);

                public abstract a setVersion(String str);
            }

            public static a builder() {
                return new x1();
            }

            public abstract String getBuildVersion();

            public abstract int getPlatform();

            public abstract String getVersion();

            public abstract boolean isJailbroken();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class f {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static abstract class a {
                public abstract f build();

                public abstract a setIdentifier(String str);
            }

            public static a builder() {
                return new z1();
            }

            public abstract String getIdentifier();
        }

        public static b builder() {
            return new n0().setCrashed(false);
        }

        public abstract a getApp();

        public abstract String getAppQualitySessionId();

        public abstract c getDevice();

        public abstract Long getEndedAt();

        public abstract List<d> getEvents();

        public abstract String getGenerator();

        public abstract int getGeneratorType();

        public abstract String getIdentifier();

        public byte[] getIdentifierUtf8Bytes() {
            return getIdentifier().getBytes(f2.f71252a);
        }

        public abstract AbstractC0732e getOs();

        public abstract long getStartedAt();

        public abstract f getUser();

        public abstract boolean isCrashed();

        public abstract b toBuilder();
    }

    public static b builder() {
        return new b0();
    }

    public abstract b0 a();

    public abstract a getAppExitInfo();

    public abstract String getAppQualitySessionId();

    public abstract String getBuildVersion();

    public abstract String getDisplayVersion();

    public abstract String getFirebaseAuthenticationToken();

    public abstract String getFirebaseInstallationId();

    public abstract String getGmpAppId();

    public abstract String getInstallationUuid();

    public abstract d getNdkPayload();

    public abstract int getPlatform();

    public abstract String getSdkVersion();

    public abstract e getSession();

    public g2 getType() {
        return getSession() != null ? g2.f71268c : getNdkPayload() != null ? g2.f71269e : g2.f71267b;
    }

    public f2 withAppQualitySessionId(String str) {
        b appQualitySessionId = a().setAppQualitySessionId(str);
        if (getSession() != null) {
            appQualitySessionId.setSession(getSession().toBuilder().setAppQualitySessionId(str).build());
        }
        return appQualitySessionId.build();
    }

    public f2 withApplicationExitInfo(a aVar) {
        return aVar == null ? this : a().setAppExitInfo(aVar).build();
    }

    public f2 withEvents(List<e.d> list) {
        if (getSession() != null) {
            return a().setSession(getSession().toBuilder().setEvents(list).build()).build();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public f2 withFirebaseAuthenticationToken(String str) {
        return a().setFirebaseAuthenticationToken(str).build();
    }

    public f2 withFirebaseInstallationId(String str) {
        return a().setFirebaseInstallationId(str).build();
    }

    public f2 withNdkPayload(d dVar) {
        return a().setSession(null).setNdkPayload(dVar).build();
    }

    public f2 withOrganizationId(String str) {
        b0 b0VarA = a();
        d ndkPayload = getNdkPayload();
        if (ndkPayload != null) {
            b0VarA.setNdkPayload(ndkPayload.a().setOrgId(str).build());
        }
        e session = getSession();
        if (session != null) {
            e.a app = session.getApp();
            e.a.b organization = app.getOrganization();
            b0VarA.setSession(session.toBuilder().setApp(app.a().setOrganization((organization != null ? organization.a() : e.a.b.builder()).setClsId(str).build()).build()).build());
        }
        return b0VarA.build();
    }

    public f2 withSessionEndFields(long j10, boolean z10, String str) {
        b0 b0VarA = a();
        if (getSession() != null) {
            e.b builder = getSession().toBuilder();
            builder.setEndedAt(Long.valueOf(j10));
            builder.setCrashed(z10);
            if (str != null) {
                builder.setUser(e.f.builder().setIdentifier(str).build());
            }
            b0VarA.setSession(builder.build());
        }
        return b0VarA.build();
    }
}
