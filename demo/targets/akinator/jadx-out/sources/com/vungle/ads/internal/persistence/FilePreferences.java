package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.util.CollectionsConcurrencyUtil;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import on.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FilePreferences {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "vngFailedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, FilePreferences> filePreferenceMap = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ FilePreferences get$default(Companion companion, Executor executor, PathProvider pathProvider, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = FilePreferences.FILENAME;
            }
            return companion.get(executor, pathProvider, str);
        }

        public final synchronized FilePreferences get(Executor ioExecutor, PathProvider pathProvider, String filename) {
            Object filePreferences;
            Object objPutIfAbsent;
            try {
                e0.checkNotNullParameter(ioExecutor, "ioExecutor");
                e0.checkNotNullParameter(pathProvider, "pathProvider");
                e0.checkNotNullParameter(filename, "filename");
                ConcurrentHashMap concurrentHashMap = FilePreferences.filePreferenceMap;
                filePreferences = concurrentHashMap.get(filename);
                if (filePreferences == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (filePreferences = new FilePreferences(ioExecutor, pathProvider, filename, null)))) != null) {
                    filePreferences = objPutIfAbsent;
                }
                e0.checkNotNullExpressionValue(filePreferences, "filePreferenceMap.getOrP…, filename)\n            }");
            } catch (Throwable th2) {
                throw th2;
            }
            return (FilePreferences) filePreferences;
        }

        private Companion() {
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }
    }

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, u uVar) {
        this(executor, pathProvider, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m3623apply$lambda0(FilePreferences this$0, Serializable serializable) throws Throwable {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(serializable, "$serializable");
        FileUtility.writeSerializable(this$0.file, serializable);
    }

    public static final synchronized FilePreferences get(Executor executor, PathProvider pathProvider, String str) {
        return Companion.get(executor, pathProvider, str);
    }

    public final void apply() {
        this.ioExecutor.execute(new z(18, this, new HashMap(this.values)));
    }

    public final boolean getBoolean(String key, boolean z10) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public final int getInt(String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : i10;
    }

    public final long getLong(String key, long j10) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : j10;
    }

    public final String getString(String key, String defaultValue) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj) : defaultValue;
    }

    public final FilePreferences put(String key, boolean z10) {
        e0.checkNotNullParameter(key, "key");
        this.values.put(key, Boolean.valueOf(z10));
        return this;
    }

    public final FilePreferences remove(String key) {
        e0.checkNotNullParameter(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private FilePreferences(Executor executor, PathProvider pathProvider, String str) throws Throwable {
        this.ioExecutor = executor;
        File file = new File(pathProvider.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = FileUtility.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    public final FilePreferences put(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final Boolean getBoolean(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final FilePreferences put(String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        this.values.put(key, Integer.valueOf(i10));
        return this;
    }

    public final FilePreferences put(String key, HashSet<String> hashSet) {
        e0.checkNotNullParameter(key, "key");
        this.values.put(key, CollectionsConcurrencyUtil.getNewHashSet(hashSet));
        return this;
    }

    public final FilePreferences put(String key, long j10) {
        e0.checkNotNullParameter(key, "key");
        this.values.put(key, Long.valueOf(j10));
        return this;
    }

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, int i10, u uVar) {
        this(executor, pathProvider, (i10 & 4) != 0 ? FILENAME : str);
    }
}
