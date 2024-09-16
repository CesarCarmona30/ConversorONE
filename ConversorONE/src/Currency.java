import com.google.gson.internal.LinkedTreeMap;

public record Currency(String time_last_update_utc,
                       String time_next_update_utc,
                       String base_code,
                       LinkedTreeMap<String, Object> conversion_rates) {
}