package org.example.common;

import lombok.Data;

@Data
public class AjaxResult {
    private boolean success = true;
    private String msg = "success";
    private Object data;
}
