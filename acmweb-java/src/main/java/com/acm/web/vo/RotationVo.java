package com.acm.web.vo;

import com.acm.web.entity.Rotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RotationVo {

    private Integer sum;

    private List<Rotation> urlList;

}
