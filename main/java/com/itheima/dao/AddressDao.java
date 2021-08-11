package com.itheima.dao;

import com.itheima.entity.Address;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AddressDao {

    /**
     通过uid分页查询某个用户的地址
     */
    List<Address> findByUid(@Param("uid") int uid, @Param("begin")int begin,@Param("size")int size);

    /**
     * 通过uid查询某个用户收货地址总数
     * @param uid
     * @return
     */
    int findCount(int uid);

    /**
     通过aid查询一个地址
     */
    Address findByAid(int aid);

    /**
     保存地址
     */
    int save(Address address);

    /**
     * 更新当前用户所有的默认地址为0
     */
    int updateAddressIsNotDefault(int uid);

    /**
     * 更新当前地址为默认1
     */
    int updateAddressIsDefault(int aid);

    /**
     * 更新地址信息
     */
    int update(Address address);

    /**
     * 删除操作
     */
    int delete(Integer aid);
}
